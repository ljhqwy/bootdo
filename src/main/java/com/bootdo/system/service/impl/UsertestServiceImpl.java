package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.UsertestDao;
import com.bootdo.system.domain.UsertestDO;
import com.bootdo.system.service.UsertestService;



@Service
public class UsertestServiceImpl implements UsertestService {
	@Autowired
	private UsertestDao usertestDao;
	
	@Override
	public UsertestDO get(Integer id){
		return usertestDao.get(id);
	}
	
	@Override
	public List<UsertestDO> list(Map<String, Object> map){
		return usertestDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return usertestDao.count(map);
	}
	
	@Override
	public int save(UsertestDO usertest){
		return usertestDao.save(usertest);
	}
	
	@Override
	public int update(UsertestDO usertest){
		return usertestDao.update(usertest);
	}
	
	@Override
	public int remove(Integer id){
		return usertestDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return usertestDao.batchRemove(ids);
	}
	
}
