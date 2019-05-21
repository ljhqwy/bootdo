package com.bootdo.system.dao;

import com.bootdo.system.domain.UsertestDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-13 16:13:44
 */
@Mapper
public interface UsertestDao {

	UsertestDO get(Integer id);
	
	List<UsertestDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UsertestDO usertest);
	
	int update(UsertestDO usertest);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
