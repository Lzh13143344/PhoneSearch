package com.offcn.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.offcn.po.Mobile;

public interface MobileDao {
       //查询
	public Mobile getByMNumber(@Param("mobileNumber") String mobileNumber);
}
