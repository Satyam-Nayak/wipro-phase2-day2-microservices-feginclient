package com.wipro.Employee_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Company-service")
public interface CompanyClient {

    @GetMapping("/company/{pcode}")
    Object getCompanyByPcode(@PathVariable Long pcode);
}
