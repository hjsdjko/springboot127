package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.YaocairenzhengxinxiEntity;
import com.cl.entity.view.YaocairenzhengxinxiView;

import com.cl.service.YaocairenzhengxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 药材认证信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
@RestController
@RequestMapping("/yaocairenzhengxinxi")
public class YaocairenzhengxinxiController {
    @Autowired
    private YaocairenzhengxinxiService yaocairenzhengxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaocairenzhengxinxiEntity yaocairenzhengxinxi,
		HttpServletRequest request){
        EntityWrapper<YaocairenzhengxinxiEntity> ew = new EntityWrapper<YaocairenzhengxinxiEntity>();

		PageUtils page = yaocairenzhengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocairenzhengxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaocairenzhengxinxiEntity yaocairenzhengxinxi, 
		HttpServletRequest request){
        EntityWrapper<YaocairenzhengxinxiEntity> ew = new EntityWrapper<YaocairenzhengxinxiEntity>();

		PageUtils page = yaocairenzhengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocairenzhengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaocairenzhengxinxiEntity yaocairenzhengxinxi){
       	EntityWrapper<YaocairenzhengxinxiEntity> ew = new EntityWrapper<YaocairenzhengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaocairenzhengxinxi, "yaocairenzhengxinxi")); 
        return R.ok().put("data", yaocairenzhengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaocairenzhengxinxiEntity yaocairenzhengxinxi){
        EntityWrapper< YaocairenzhengxinxiEntity> ew = new EntityWrapper< YaocairenzhengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaocairenzhengxinxi, "yaocairenzhengxinxi")); 
		YaocairenzhengxinxiView yaocairenzhengxinxiView =  yaocairenzhengxinxiService.selectView(ew);
		return R.ok("查询药材认证信息成功").put("data", yaocairenzhengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaocairenzhengxinxiEntity yaocairenzhengxinxi = yaocairenzhengxinxiService.selectById(id);
		yaocairenzhengxinxi = yaocairenzhengxinxiService.selectView(new EntityWrapper<YaocairenzhengxinxiEntity>().eq("id", id));
        return R.ok().put("data", yaocairenzhengxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaocairenzhengxinxiEntity yaocairenzhengxinxi = yaocairenzhengxinxiService.selectById(id);
		yaocairenzhengxinxi = yaocairenzhengxinxiService.selectView(new EntityWrapper<YaocairenzhengxinxiEntity>().eq("id", id));
        return R.ok().put("data", yaocairenzhengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaocairenzhengxinxiEntity yaocairenzhengxinxi, HttpServletRequest request){
    	yaocairenzhengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocairenzhengxinxi);
        yaocairenzhengxinxiService.insert(yaocairenzhengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaocairenzhengxinxiEntity yaocairenzhengxinxi, HttpServletRequest request){
    	yaocairenzhengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocairenzhengxinxi);
        yaocairenzhengxinxiService.insert(yaocairenzhengxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YaocairenzhengxinxiEntity yaocairenzhengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaocairenzhengxinxi);
        yaocairenzhengxinxiService.updateById(yaocairenzhengxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaocairenzhengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}