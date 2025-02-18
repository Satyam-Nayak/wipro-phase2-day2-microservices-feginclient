package com.wipro.Employee_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Project-service")  // Or use "API-GATEWAY" if applicable
public interface ProjectClient {

    @GetMapping("/project/{pcode}")  // Make sure this matches the actual Project-service endpoint
    Object getProjectByPcode(@PathVariable("pcode") Long pcode);
}
