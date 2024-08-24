package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YaocaishuxingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaishuxingView;


/**
 * 药材属性
 *
 * @author 
 * @email 
 * @date 2024-03-26 15:11:09
 */
public interface YaocaishuxingService extends IService<YaocaishuxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocaishuxingView> selectListView(Wrapper<YaocaishuxingEntity> wrapper);
   	
   	YaocaishuxingView selectView(@Param("ew") Wrapper<YaocaishuxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocaishuxingEntity> wrapper);
   	

}

