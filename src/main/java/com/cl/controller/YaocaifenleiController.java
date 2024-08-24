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

import com.cl.entity.YaocaifenleiEntity;
import com.cl.entity.view.YaocaifenleiView;

import com.cl.service.YaocaifenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 药材分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
@RestController
@RequestMapping("/yaocaifenlei")
public class YaocaifenleiController {
    @Autowired
    private YaocaifenleiService yaocaifenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaocaifenleiEntity yaocaifenlei,
		HttpServletRequest request){
        EntityWrapper<YaocaifenleiEntity> ew = new EntityWrapper<YaocaifenleiEntity>();

		PageUtils page = yaocaifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaifenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaocaifenleiEntity yaocaifenlei, 
		HttpServletRequest request){
        EntityWrapper<YaocaifenleiEntity> ew = new EntityWrapper<YaocaifenleiEntity>();

		PageUtils page = yaocaifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaifenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaocaifenleiEntity yaocaifenlei){
       	EntityWrapper<YaocaifenleiEntity> ew = new EntityWrapper<YaocaifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaocaifenlei, "yaocaifenlei")); 
        return R.ok().put("data", yaocaifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaocaifenleiEntity yaocaifenlei){
        EntityWrapper< YaocaifenleiEntity> ew = new EntityWrapper< YaocaifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaocaifenlei, "yaocaifenlei")); 
		YaocaifenleiView yaocaifenleiView =  yaocaifenleiService.selectView(ew);
		return R.ok("查询药材分类成功").put("data", yaocaifenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaocaifenleiEntity yaocaifenlei = yaocaifenleiService.selectById(id);
		yaocaifenlei = yaocaifenleiService.selectView(new EntityWrapper<YaocaifenleiEntity>().eq("id", id));
        return R.ok().put("data", yaocaifenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaocaifenleiEntity yaocaifenlei = yaocaifenleiService.selectById(id);
		yaocaifenlei = yaocaifenleiService.selectView(new EntityWrapper<YaocaifenleiEntity>().eq("id", id));
        return R.ok().put("data", yaocaifenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaocaifenleiEntity yaocaifenlei, HttpServletRequest request){
    	yaocaifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaifenlei);
        yaocaifenleiService.insert(yaocaifenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaocaifenleiEntity yaocaifenlei, HttpServletRequest request){
    	yaocaifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaifenlei);
        yaocaifenleiService.insert(yaocaifenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YaocaifenleiEntity yaocaifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaocaifenlei);
        yaocaifenleiService.updateById(yaocaifenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaocaifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
