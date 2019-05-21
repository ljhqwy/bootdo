package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.UsertestDO;
import com.bootdo.system.service.UsertestService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-13 16:13:44
 */
 
@Controller
@RequestMapping("/system/usertest")
public class UsertestController {
	@Autowired
	private UsertestService usertestService;
	
	@GetMapping()
	@RequiresPermissions("system:usertest:usertest")
	String Usertest(){
	    return "system/usertest/usertest";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:usertest:usertest")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UsertestDO> usertestList = usertestService.list(query);
		int total = usertestService.count(query);
		PageUtils pageUtils = new PageUtils(usertestList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:usertest:add")
	String add(){
	    return "system/usertest/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:usertest:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		UsertestDO usertest = usertestService.get(id);
		model.addAttribute("usertest", usertest);
	    return "system/usertest/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:usertest:add")
	public R save( UsertestDO usertest){
		if(usertestService.save(usertest)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:usertest:edit")
	public R update( UsertestDO usertest){
		usertestService.update(usertest);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:usertest:remove")
	public R remove( Integer id){
		if(usertestService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:usertest:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		usertestService.batchRemove(ids);
		return R.ok();
	}
	
}
