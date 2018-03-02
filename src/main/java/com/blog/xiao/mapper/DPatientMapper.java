package com.blog.xiao.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import com.blog.xiao.model.DPatient;
import com.blog.xiao.util.MyMapper;

import java.util.List;

public interface DPatientMapper extends MyMapper<DPatient>{

    @Select("SELECT * FROM d_patient where 1=1 and status!=0  and did = #{did} order by   #{myorder}")
    @ResultType(DPatient.class)
    List<DPatient> findAllByOrder(@Param("myorder") String myorder, @Param("did") Integer did);

}