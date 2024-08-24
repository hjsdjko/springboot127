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
 * 药材属性
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-26 15:11:09
 */
@TableName("yaocaishuxing")
public class YaocaishuxingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaocaishuxingEntity() {
		
	}
	
	public YaocaishuxingEntity(T t) {
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
	 * 药材属性名称
	 */
					
	private String yaocaishuxingmingcheng;
	
	/**
	 * 属性描述
	 */
					
	private String shuxingmiaoshu;
	
	
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
	 * 设置：药材属性名称
	 */
	public void setYaocaishuxingmingcheng(String yaocaishuxingmingcheng) {
		this.yaocaishuxingmingcheng = yaocaishuxingmingcheng;
	}
	/**
	 * 获取：药材属性名称
	 */
	public String getYaocaishuxingmingcheng() {
		return yaocaishuxingmingcheng;
	}
	/**
	 * 设置：属性描述
	 */
	public void setShuxingmiaoshu(String shuxingmiaoshu) {
		this.shuxingmiaoshu = shuxingmiaoshu;
	}
	/**
	 * 获取：属性描述
	 */
	public String getShuxingmiaoshu() {
		return shuxingmiaoshu;
	}

}
