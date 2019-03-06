package com.zhuduan.cloud.demo.order.feign.hystrix;

import com.zhuduan.cloud.demo.order.feign.CommodityService;
import org.springframework.stereotype.Component;

/**
 * The hystrix fast fail Implements of CommodityService
 *
 * @author Haifeng.Zhu
 * created at 2/27/19
 */
@Component
public class CommodityServiceHystrix implements CommodityService {

    @Override
    public String getDetail(Long id) {
        return "fast fail";
    }
}
