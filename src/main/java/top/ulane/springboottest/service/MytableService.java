package top.ulane.springboottest.service;

import top.ulane.springboottest.model.Mytable;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MytableService {
    
    public int deleteByPrimaryKey(Integer id);
    public int insert(Mytable record);
    public int insertSelective(Mytable record);
    public Mytable selectByPrimaryKey(Integer id);
    public int updateByPrimaryKeySelective(Mytable record);
    public int updateByPrimaryKey(Mytable record);
}
