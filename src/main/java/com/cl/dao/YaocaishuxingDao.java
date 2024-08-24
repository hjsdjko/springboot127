package com.cl.dao;

import com.cl.entity.YaocaishuxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaishuxingView;


/**
 * 药材属性
 * 
 * @author 
 * @email 
 * @date 2024-03-26 15:11:09
 */
public interface YaocaishuxingDao extends BaseMapper<YaocaishuxingEntity> {
	
	List<YaocaishuxingView> selectListView(@Param("ew") Wrapper<YaocaishuxingEntity> wrapper);

	List<YaocaishuxingView> selectListView(Pagination page,@Param("ew") Wrapper<YaocaishuxingEntity> wrapper);
	
	YaocaishuxingView selectView(@Param("ew") Wrapper<YaocaishuxingEntity> wrapper);
	

}
