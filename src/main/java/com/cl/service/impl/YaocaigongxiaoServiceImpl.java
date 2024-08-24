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


import com.cl.dao.YaocaigongxiaoDao;
import com.cl.entity.YaocaigongxiaoEntity;
import com.cl.service.YaocaigongxiaoService;
import com.cl.entity.view.YaocaigongxiaoView;

@Service("yaocaigongxiaoService")
public class YaocaigongxiaoServiceImpl extends ServiceImpl<YaocaigongxiaoDao, YaocaigongxiaoEntity> implements YaocaigongxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaocaigongxiaoEntity> page = this.selectPage(
                new Query<YaocaigongxiaoEntity>(params).getPage(),
                new EntityWrapper<YaocaigongxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaocaigongxiaoEntity> wrapper) {
		  Page<YaocaigongxiaoView> page =new Query<YaocaigongxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YaocaigongxiaoView> selectListView(Wrapper<YaocaigongxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaocaigongxiaoView selectView(Wrapper<YaocaigongxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
