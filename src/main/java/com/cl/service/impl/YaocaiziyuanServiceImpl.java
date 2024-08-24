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


import com.cl.dao.YaocaiziyuanDao;
import com.cl.entity.YaocaiziyuanEntity;
import com.cl.service.YaocaiziyuanService;
import com.cl.entity.view.YaocaiziyuanView;

@Service("yaocaiziyuanService")
public class YaocaiziyuanServiceImpl extends ServiceImpl<YaocaiziyuanDao, YaocaiziyuanEntity> implements YaocaiziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaocaiziyuanEntity> page = this.selectPage(
                new Query<YaocaiziyuanEntity>(params).getPage(),
                new EntityWrapper<YaocaiziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaocaiziyuanEntity> wrapper) {
		  Page<YaocaiziyuanView> page =new Query<YaocaiziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YaocaiziyuanView> selectListView(Wrapper<YaocaiziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaocaiziyuanView selectView(Wrapper<YaocaiziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
