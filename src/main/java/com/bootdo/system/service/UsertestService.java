package com.bootdo.system.service;

import com.bootdo.system.domain.UsertestDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-13 16:13:44
 */
public interface UsertestService {
	
	UsertestDO get(Integer id);
	
	List<UsertestDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UsertestDO usertest);
	
	int update(UsertestDO usertest);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
