package com.atcsii.scwmf.manager.dao;

import com.atcsii.scwmf.manager.bean.TMemeber;
import com.atcsii.scwmf.manager.bean.TMemeberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemeberMapper {
    long countByExample(TMemeberExample example);

    int deleteByExample(TMemeberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMemeber record);

    int insertSelective(TMemeber record);

    List<TMemeber> selectByExample(TMemeberExample example);

    TMemeber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMemeber record, @Param("example") TMemeberExample example);

    int updateByExample(@Param("record") TMemeber record, @Param("example") TMemeberExample example);

    int updateByPrimaryKeySelective(TMemeber record);

    int updateByPrimaryKey(TMemeber record);
}