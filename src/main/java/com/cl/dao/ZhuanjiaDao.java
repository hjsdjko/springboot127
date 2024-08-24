package com.cl.dao;

import com.cl.entity.ZhuanjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhuanjiaView;


/**
 * 专家
 * 
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface ZhuanjiaDao extends BaseMapper<ZhuanjiaEntity> {
	
	List<ZhuanjiaView> selectListView(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);

	List<ZhuanjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
	
	ZhuanjiaView selectView(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
	

}
