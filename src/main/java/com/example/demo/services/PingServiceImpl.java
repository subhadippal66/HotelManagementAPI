package com.example.demo.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PingServiceImpl implements PingService {
	
	@Override
	public Map<String, String> ping() {
		
		Map<String,String> info = new HashMap<String,String>();
		
		info.put("status", "success");
		info.put("statusCode", "200");
		
		return info;
	}

}
