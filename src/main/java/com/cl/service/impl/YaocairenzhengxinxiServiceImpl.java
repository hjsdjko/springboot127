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


import com.cl.dao.YaocairenzhengxinxiDao;
import com.cl.entity.YaocairenzhengxinxiEntity;
import com.cl.service.YaocairenzhengxinxiService;
import com.cl.entity.view.YaocairenzhengxinxiView;

@Service("yaocairenzhengxinxiService")
public class YaocairenzhengxinxiServiceImpl extends ServiceImpl<YaocairenzhengxinxiDao, YaocairenzhengxinxiEntity> implements YaocairenzhengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaocairenzhengxinxiEntity> page = this.selectPage(
                new Query<YaocairenzhengxinxiEntity>(params).getPage(),
                new EntityWrapper<YaocairenzhengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaocairenzhengxinxiEntity> wrapper) {
		  Page<YaocairenzhengxinxiView> page =new Query<YaocairenzhengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YaocairenzhengxinxiView> selectListView(Wrapper<YaocairenzhengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaocairenzhengxinxiView selectView(Wrapper<YaocairenzhengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
