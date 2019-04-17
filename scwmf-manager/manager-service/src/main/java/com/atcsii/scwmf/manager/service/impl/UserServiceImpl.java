package com.atcsii.scwmf.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atcsii.scwmf.manager.bean.TUser;
import com.atcsii.scwmf.manager.dao.TUserMapper;
import com.atcsii.scwmf.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private TUserMapper userMapper;
	
	public TUser getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
    

}
