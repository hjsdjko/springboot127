package com.cl.dao;

import com.cl.entity.YaocaifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaifenleiView;


/**
 * 药材分类
 * 
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocaifenleiDao extends BaseMapper<YaocaifenleiEntity> {
	
	List<YaocaifenleiView> selectListView(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);

	List<YaocaifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
	
	YaocaifenleiView selectView(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
	

}
