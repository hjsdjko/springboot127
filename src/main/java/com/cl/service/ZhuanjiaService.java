package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhuanjiaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhuanjiaView;


/**
 * 专家
 *
 * @author 
 * @email 
 * @date 2024-03-26 15:11:08
 */
public interface ZhuanjiaService extends IService<ZhuanjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanjiaView> selectListView(Wrapper<ZhuanjiaEntity> wrapper);
   	
   	ZhuanjiaView selectView(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanjiaEntity> wrapper);
   	

}

