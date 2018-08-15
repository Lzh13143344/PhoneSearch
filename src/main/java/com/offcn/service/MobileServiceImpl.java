package com.offcn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.MobileDao;
import com.offcn.po.Mobile;
@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileDao md;
	
	@Override
	public Mobile getByMNumber(String mobileNumber) {
		String substring ="";
        if(mobileNumber.length()>7){
        	substring = mobileNumber.substring(0, 7);
        	
        }
		return md.getByMNumber(substring);
	}

	@Override
	public Mobile getByMNumberForClient(String mobileNumber) {
		String substring ="";
        if(mobileNumber.length()>7){
        	substring = mobileNumber.substring(0, 7);
        	
        }
		
		return md.getByMNumber(substring);
	}

}
