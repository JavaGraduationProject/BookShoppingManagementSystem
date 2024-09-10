package com.dao;

import com.entity.TushuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuxinxiVO;
import com.entity.view.TushuxinxiView;


/**
 * 图书信息
 * 
 * @author 
 * @email 
 * @date 2022-03-15 15:50:13
 */
public interface TushuxinxiDao extends BaseMapper<TushuxinxiEntity> {
	
	List<TushuxinxiVO> selectListVO(@Param("ew") Wrapper<TushuxinxiEntity> wrapper);
	
	TushuxinxiVO selectVO(@Param("ew") Wrapper<TushuxinxiEntity> wrapper);
	
	List<TushuxinxiView> selectListView(@Param("ew") Wrapper<TushuxinxiEntity> wrapper);

	List<TushuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TushuxinxiEntity> wrapper);
	
	TushuxinxiView selectView(@Param("ew") Wrapper<TushuxinxiEntity> wrapper);
	

}
