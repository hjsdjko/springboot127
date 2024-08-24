package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YaocaigongxiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YaocaigongxiaoView;


/**
 * 药材功效
 *
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface YaocaigongxiaoService extends IService<YaocaigongxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocaigongxiaoView> selectListView(Wrapper<YaocaigongxiaoEntity> wrapper);
   	
   	YaocaigongxiaoView selectView(@Param("ew") Wrapper<YaocaigongxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocaigongxiaoEntity> wrapper);
   	

}

