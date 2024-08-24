package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YaocaifenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaifenleiView;


/**
 * 药材分类
 *
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocaifenleiService extends IService<YaocaifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocaifenleiView> selectListView(Wrapper<YaocaifenleiEntity> wrapper);
   	
   	YaocaifenleiView selectView(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocaifenleiEntity> wrapper);
   	

}

