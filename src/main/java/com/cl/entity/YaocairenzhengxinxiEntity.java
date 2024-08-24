package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 药材认证信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
@TableName("yaocairenzhengxinxi")
public class YaocairenzhengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaocairenzhengxinxiEntity() {
		
	}
	
	public YaocairenzhengxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 药材名称
	 */
					
	private String yaocaimingcheng;
	
	/**
	 * 药材分类
	 */
					
	private String yaocaifenlei;
	
	/**
	 * 产地
	 */
					
	private String chandi;
	
	/**
	 * 认证标准
	 */
					
	private String renzhengbiaozhun;
	
	/**
	 * 质量指标
	 */
					
	private String zhiliangzhibiao;
	
	/**
	 * 认证机构
	 */
					
	private String renzhengjigou;
	
	/**
	 * 认证日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date renzhengriqi;
	
	/**
	 * 有效期
	 */
					
	private String youxiaoqi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：药材名称
	 */
	public void setYaocaimingcheng(String yaocaimingcheng) {
		this.yaocaimingcheng = yaocaimingcheng;
	}
	/**
	 * 获取：药材名称
	 */
	public String getYaocaimingcheng() {
		return yaocaimingcheng;
	}
	/**
	 * 设置：药材分类
	 */
	public void setYaocaifenlei(String yaocaifenlei) {
		this.yaocaifenlei = yaocaifenlei;
	}
	/**
	 * 获取：药材分类
	 */
	public String getYaocaifenlei() {
		return yaocaifenlei;
	}
	/**
	 * 设置：产地
	 */
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
	/**
	 * 设置：认证标准
	 */
	public void setRenzhengbiaozhun(String renzhengbiaozhun) {
		this.renzhengbiaozhun = renzhengbiaozhun;
	}
	/**
	 * 获取：认证标准
	 */
	public String getRenzhengbiaozhun() {
		return renzhengbiaozhun;
	}
	/**
	 * 设置：质量指标
	 */
	public void setZhiliangzhibiao(String zhiliangzhibiao) {
		this.zhiliangzhibiao = zhiliangzhibiao;
	}
	/**
	 * 获取：质量指标
	 */
	public String getZhiliangzhibiao() {
		return zhiliangzhibiao;
	}
	/**
	 * 设置：认证机构
	 */
	public void setRenzhengjigou(String renzhengjigou) {
		this.renzhengjigou = renzhengjigou;
	}
	/**
	 * 获取：认证机构
	 */
	public String getRenzhengjigou() {
		return renzhengjigou;
	}
	/**
	 * 设置：认证日期
	 */
	public void setRenzhengriqi(Date renzhengriqi) {
		this.renzhengriqi = renzhengriqi;
	}
	/**
	 * 获取：认证日期
	 */
	public Date getRenzhengriqi() {
		return renzhengriqi;
	}
	/**
	 * 设置：有效期
	 */
	public void setYouxiaoqi(String youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	/**
	 * 获取：有效期
	 */
	public String getYouxiaoqi() {
		return youxiaoqi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}

}
