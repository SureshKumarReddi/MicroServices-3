package com.Suresh.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "WELCOMESERVICE")
public interface FeignUnderstanding {

	@RequestMapping("/greet")
	public String getString();
}
