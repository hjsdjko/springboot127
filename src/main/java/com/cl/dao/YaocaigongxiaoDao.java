package com.cl.dao;

import com.cl.entity.YaocaigongxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaigongxiaoView;


/**
 * 药材功效
 * 
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocaigongxiaoDao extends BaseMapper<YaocaigongxiaoEntity> {
	
	List<YaocaigongxiaoView> selectListView(@Param("ew") Wrapper<YaocaigongxiaoEntity> wrapper);

	List<YaocaigongxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YaocaigongxiaoEntity> wrapper);
	
	YaocaigongxiaoView selectView(@Param("ew") Wrapper<YaocaigongxiaoEntity> wrapper);
	

}
