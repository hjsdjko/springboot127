package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YaocaiziyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaiziyuanView;


/**
 * 药材资源
 *
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocaiziyuanService extends IService<YaocaiziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocaiziyuanView> selectListView(Wrapper<YaocaiziyuanEntity> wrapper);
   	
   	YaocaiziyuanView selectView(@Param("ew") Wrapper<YaocaiziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocaiziyuanEntity> wrapper);
   	

}

