package com.Suresh.Controllers;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Suresh.Feign.FeignUnderstanding;

@RestController
public class FirstController {

	@Autowired
	private FeignUnderstanding feignUnderstanding;
	
	@GetMapping("/message")
	public String getMessages() {
		
		String message = "Good Morning";
		
		String string = feignUnderstanding.getString();
		
		
		StringJoiner sj = new StringJoiner(",");
		sj.add(message);
		sj.add(string);
		
		
		return sj.toString();
	}
}
