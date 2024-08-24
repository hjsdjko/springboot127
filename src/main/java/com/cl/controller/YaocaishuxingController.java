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

import com.cl.entity.YaocaishuxingEntity;
import com.cl.entity.view.YaocaishuxingView;

import com.cl.service.YaocaishuxingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 药材属性
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-26 15:11:09
 */
@RestController
@RequestMapping("/yaocaishuxing")
public class YaocaishuxingController {
    @Autowired
    private YaocaishuxingService yaocaishuxingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaocaishuxingEntity yaocaishuxing,
		HttpServletRequest request){
        EntityWrapper<YaocaishuxingEntity> ew = new EntityWrapper<YaocaishuxingEntity>();

		PageUtils page = yaocaishuxingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaishuxing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaocaishuxingEntity yaocaishuxing, 
		HttpServletRequest request){
        EntityWrapper<YaocaishuxingEntity> ew = new EntityWrapper<YaocaishuxingEntity>();

		PageUtils page = yaocaishuxingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaishuxing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaocaishuxingEntity yaocaishuxing){
       	EntityWrapper<YaocaishuxingEntity> ew = new EntityWrapper<YaocaishuxingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaocaishuxing, "yaocaishuxing")); 
        return R.ok().put("data", yaocaishuxingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaocaishuxingEntity yaocaishuxing){
        EntityWrapper< YaocaishuxingEntity> ew = new EntityWrapper< YaocaishuxingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaocaishuxing, "yaocaishuxing")); 
		YaocaishuxingView yaocaishuxingView =  yaocaishuxingService.selectView(ew);
		return R.ok("查询药材属性成功").put("data", yaocaishuxingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaocaishuxingEntity yaocaishuxing = yaocaishuxingService.selectById(id);
		yaocaishuxing = yaocaishuxingService.selectView(new EntityWrapper<YaocaishuxingEntity>().eq("id", id));
        return R.ok().put("data", yaocaishuxing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaocaishuxingEntity yaocaishuxing = yaocaishuxingService.selectById(id);
		yaocaishuxing = yaocaishuxingService.selectView(new EntityWrapper<YaocaishuxingEntity>().eq("id", id));
        return R.ok().put("data", yaocaishuxing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaocaishuxingEntity yaocaishuxing, HttpServletRequest request){
    	yaocaishuxing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaishuxing);
        yaocaishuxingService.insert(yaocaishuxing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaocaishuxingEntity yaocaishuxing, HttpServletRequest request){
    	yaocaishuxing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaishuxing);
        yaocaishuxingService.insert(yaocaishuxing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YaocaishuxingEntity yaocaishuxing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaocaishuxing);
        yaocaishuxingService.updateById(yaocaishuxing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaocaishuxingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
