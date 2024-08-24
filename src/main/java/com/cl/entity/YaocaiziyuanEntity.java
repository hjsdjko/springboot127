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
 * 药材资源
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
@TableName("yaocaiziyuan")
public class YaocaiziyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaocaiziyuanEntity() {
		
	}
	
	public YaocaiziyuanEntity(T t) {
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
	 * 药材编号
	 */
					
	private String yaocaibianhao;
	
	/**
	 * 药材名称
	 */
					
	private String yaocaimingcheng;
	
	/**
	 * 药材分类
	 */
					
	private String yaocaifenlei;
	
	/**
	 * 外观特征
	 */
					
	private String waiguantezheng;
	
	/**
	 * 用法
	 */
					
	private String yongfa;
	
	/**
	 * 气味
	 */
					
	private String qiwei;
	
	/**
	 * 采集季节
	 */
					
	private String caijijijie;
	
	/**
	 * 采集方法
	 */
					
	private String caijifangfa;
	
	/**
	 * 价值
	 */
					
	private Double jiazhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 经度
	 */
					
	private Double longitude;
	
	/**
	 * 纬度
	 */
					
	private Double latitude;
	
	/**
	 * 地址
	 */
					
	private String fulladdress;
	
	
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
	 * 设置：药材编号
	 */
	public void setYaocaibianhao(String yaocaibianhao) {
		this.yaocaibianhao = yaocaibianhao;
	}
	/**
	 * 获取：药材编号
	 */
	public String getYaocaibianhao() {
		return yaocaibianhao;
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
	 * 设置：外观特征
	 */
	public void setWaiguantezheng(String waiguantezheng) {
		this.waiguantezheng = waiguantezheng;
	}
	/**
	 * 获取：外观特征
	 */
	public String getWaiguantezheng() {
		return waiguantezheng;
	}
	/**
	 * 设置：用法
	 */
	public void setYongfa(String yongfa) {
		this.yongfa = yongfa;
	}
	/**
	 * 获取：用法
	 */
	public String getYongfa() {
		return yongfa;
	}
	/**
	 * 设置：气味
	 */
	public void setQiwei(String qiwei) {
		this.qiwei = qiwei;
	}
	/**
	 * 获取：气味
	 */
	public String getQiwei() {
		return qiwei;
	}
	/**
	 * 设置：采集季节
	 */
	public void setCaijijijie(String caijijijie) {
		this.caijijijie = caijijijie;
	}
	/**
	 * 获取：采集季节
	 */
	public String getCaijijijie() {
		return caijijijie;
	}
	/**
	 * 设置：采集方法
	 */
	public void setCaijifangfa(String caijifangfa) {
		this.caijifangfa = caijifangfa;
	}
	/**
	 * 获取：采集方法
	 */
	public String getCaijifangfa() {
		return caijifangfa;
	}
	/**
	 * 设置：价值
	 */
	public void setJiazhi(Double jiazhi) {
		this.jiazhi = jiazhi;
	}
	/**
	 * 获取：价值
	 */
	public Double getJiazhi() {
		return jiazhi;
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
	/**
	 * 设置：经度
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * 设置：地址
	 */
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}

}
