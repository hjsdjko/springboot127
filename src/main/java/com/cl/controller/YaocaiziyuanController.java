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

import com.cl.entity.YaocaiziyuanEntity;
import com.cl.entity.view.YaocaiziyuanView;

import com.cl.service.YaocaiziyuanService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 药材资源
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
@RestController
@RequestMapping("/yaocaiziyuan")
public class YaocaiziyuanController {
    @Autowired
    private YaocaiziyuanService yaocaiziyuanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaocaiziyuanEntity yaocaiziyuan,
		HttpServletRequest request){
        EntityWrapper<YaocaiziyuanEntity> ew = new EntityWrapper<YaocaiziyuanEntity>();

		PageUtils page = yaocaiziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaiziyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaocaiziyuanEntity yaocaiziyuan, 
		HttpServletRequest request){
        EntityWrapper<YaocaiziyuanEntity> ew = new EntityWrapper<YaocaiziyuanEntity>();

		PageUtils page = yaocaiziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaiziyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaocaiziyuanEntity yaocaiziyuan){
       	EntityWrapper<YaocaiziyuanEntity> ew = new EntityWrapper<YaocaiziyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaocaiziyuan, "yaocaiziyuan")); 
        return R.ok().put("data", yaocaiziyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaocaiziyuanEntity yaocaiziyuan){
        EntityWrapper< YaocaiziyuanEntity> ew = new EntityWrapper< YaocaiziyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaocaiziyuan, "yaocaiziyuan")); 
		YaocaiziyuanView yaocaiziyuanView =  yaocaiziyuanService.selectView(ew);
		return R.ok("查询药材资源成功").put("data", yaocaiziyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaocaiziyuanEntity yaocaiziyuan = yaocaiziyuanService.selectById(id);
		yaocaiziyuan = yaocaiziyuanService.selectView(new EntityWrapper<YaocaiziyuanEntity>().eq("id", id));
        return R.ok().put("data", yaocaiziyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaocaiziyuanEntity yaocaiziyuan = yaocaiziyuanService.selectById(id);
		yaocaiziyuan = yaocaiziyuanService.selectView(new EntityWrapper<YaocaiziyuanEntity>().eq("id", id));
        return R.ok().put("data", yaocaiziyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaocaiziyuanEntity yaocaiziyuan, HttpServletRequest request){
    	yaocaiziyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaiziyuan);
        yaocaiziyuanService.insert(yaocaiziyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaocaiziyuanEntity yaocaiziyuan, HttpServletRequest request){
    	yaocaiziyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaiziyuan);
        yaocaiziyuanService.insert(yaocaiziyuan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YaocaiziyuanEntity yaocaiziyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaocaiziyuan);
        yaocaiziyuanService.updateById(yaocaiziyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaocaiziyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
