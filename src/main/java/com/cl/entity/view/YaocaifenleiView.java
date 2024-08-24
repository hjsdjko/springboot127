package com.cl.entity.view;

import com.cl.entity.YaocaifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 药材分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
@TableName("yaocaifenlei")
public class YaocaifenleiView  extends YaocaifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaocaifenleiView(){
	}
 
 	public YaocaifenleiView(YaocaifenleiEntity yaocaifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yaocaifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
