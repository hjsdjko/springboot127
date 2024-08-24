package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.YaocaishuxingDao;
import com.cl.entity.YaocaishuxingEntity;
import com.cl.service.YaocaishuxingService;
import com.cl.entity.view.YaocaishuxingView;

@Service("yaocaishuxingService")
public class YaocaishuxingServiceImpl extends ServiceImpl<YaocaishuxingDao, YaocaishuxingEntity> implements YaocaishuxingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaocaishuxingEntity> page = this.selectPage(
                new Query<YaocaishuxingEntity>(params).getPage(),
                new EntityWrapper<YaocaishuxingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaocaishuxingEntity> wrapper) {
		  Page<YaocaishuxingView> page =new Query<YaocaishuxingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YaocaishuxingView> selectListView(Wrapper<YaocaishuxingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaocaishuxingView selectView(Wrapper<YaocaishuxingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
