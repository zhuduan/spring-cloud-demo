package com.zhuduan.cloud.demo.order.feign;

import com.zhuduan.cloud.demo.order.feign.hystrix.CommodityServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * remote detail service
 *
 * @author Haifeng.Zhu
 * created at 2/26/19
 */
@FeignClient(name = "commodity", fallback = CommodityServiceHystrix.class)
public interface CommodityService {

    @RequestMapping(value = "/detail/{id}")
    public String getDetail(@PathVariable(value = "id") Long id);
}
