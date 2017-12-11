package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Manager;
import com.bean.ManagerExample;
import com.bean.ManagerExample.Criteria;
import com.dao.ManagerMapper;
import com.service.ManagerService;


@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	private ManagerMapper managermapper;
	
	@Override
	public Manager login(String name, String pass) {
		// TODO Auto-generated method stub
		ManagerExample managerExample = new ManagerExample();
		Criteria criteria = managerExample.createCriteria();
		criteria.andNameEqualTo(name);
		criteria.andPassEqualTo(pass);
		
		List<Manager> manager_list = managermapper.selectByExample(managerExample);
		
		if(manager_list!=null&&manager_list.size()>0){
			return manager_list.get(0);
		}
		
		return null;
	}

}
