package com.cl.dao;

import com.cl.entity.YaocairenzhengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocairenzhengxinxiView;


/**
 * 药材认证信息
 * 
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocairenzhengxinxiDao extends BaseMapper<YaocairenzhengxinxiEntity> {
	
	List<YaocairenzhengxinxiView> selectListView(@Param("ew") Wrapper<YaocairenzhengxinxiEntity> wrapper);

	List<YaocairenzhengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YaocairenzhengxinxiEntity> wrapper);
	
	YaocairenzhengxinxiView selectView(@Param("ew") Wrapper<YaocairenzhengxinxiEntity> wrapper);
	

}
