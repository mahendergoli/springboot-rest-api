package com.REST_api.Api_Project.Controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.REST_api.Api_Project.RestUser.RestUser;

@RestController
@RequestMapping("/user")
public class Controller {
	
	Map<String,RestUser> addValue = new HashMap<>();
	
	
	
	@GetMapping
	public Collection<RestUser> getmethod() {
		return addValue.values();
	}
	
	@PostMapping
	public String postmethod(@RequestBody RestUser userdata) {
		RestUser obj = new RestUser();
		obj.setUserId(userdata.getUserId());
		obj.setName(userdata.getName());
		obj.setQualification(userdata.getQualification());
		obj.setEmail(userdata.getEmail());
		
		addValue.put(userdata.getUserId(), obj);
		return "data added";
	}
	
	@PutMapping(path="/{userId}")
	public String putmethod(@PathVariable String userId,@RequestBody RestUser userdata) {
		if(addValue.containsKey(userId))
		{
			RestUser obj = new RestUser();
			obj.setUserId(userdata.getUserId());
			obj.setName(userdata.getName());
			obj.setQualification(userdata.getQualification());
			obj.setEmail(userdata.getEmail());
			addValue.put(userId, obj);
			
			return "edit is Done";
		}
		else {
			return "userId not Found";
			}
		}
		
	
	
	@DeleteMapping(path="/{userId}")
	public String deletemethod(@PathVariable String userId) {
		if(addValue.containsKey(userId)) {
			addValue.remove(userId);
			return "UserId Deleted Successfully";
		}
		else {
			return "UserId nOt Present";
		}
		
	}

}
