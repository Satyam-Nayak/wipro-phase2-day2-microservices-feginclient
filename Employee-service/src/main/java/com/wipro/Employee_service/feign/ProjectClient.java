package com.wipro.Employee_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Project-service")
public interface ProjectClient {

    @GetMapping("/project/{projectId}")
    Object getProjectById(@PathVariable Long projectId);
}

