package top.ulane.springboottest.service.impl;

import top.ulane.springboottest.model.Mytable;
import top.ulane.springboottest.mapper.MytableDao;
import top.ulane.springboottest.service.MytableService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.ibatis.annotations.Param;

@Service("mytableService")
public class MytableServiceImpl implements MytableService{

	@Autowired
    private MytableDao mytableDao;
    
    public int deleteByPrimaryKey(Integer id){
        return mytableDao.deleteByPrimaryKey(id);
    }

    public int insert(Mytable record){
        return mytableDao.insert(record);
    }

    public int insertSelective(Mytable record){
        return mytableDao.insertSelective(record);
    }

    public Mytable selectByPrimaryKey(Integer id){
        return mytableDao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Mytable record){
        return mytableDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Mytable record){
        return mytableDao.updateByPrimaryKey(record);
    }

}
