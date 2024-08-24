package com.cl.dao;

import com.cl.entity.YaocaiziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaiziyuanView;


/**
 * 药材资源
 * 
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocaiziyuanDao extends BaseMapper<YaocaiziyuanEntity> {
	
	List<YaocaiziyuanView> selectListView(@Param("ew") Wrapper<YaocaiziyuanEntity> wrapper);

	List<YaocaiziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YaocaiziyuanEntity> wrapper);
	
	YaocaiziyuanView selectView(@Param("ew") Wrapper<YaocaiziyuanEntity> wrapper);
	

}
