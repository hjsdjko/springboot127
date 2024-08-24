package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YaocairenzhengxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocairenzhengxinxiView;


/**
 * 药材认证信息
 *
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocairenzhengxinxiService extends IService<YaocairenzhengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocairenzhengxinxiView> selectListView(Wrapper<YaocairenzhengxinxiEntity> wrapper);
   	
   	YaocairenzhengxinxiView selectView(@Param("ew") Wrapper<YaocairenzhengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocairenzhengxinxiEntity> wrapper);
   	

}

