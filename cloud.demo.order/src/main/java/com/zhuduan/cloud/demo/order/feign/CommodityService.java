package com.zhuduan.cloud.demo.order.feign;

import cloud.demo.pojo.vo.CommodityDetailVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * remote detail service
 *
 * @author Haifeng.Zhu
 * created at 2/26/19
 */
@FeignClient(name = "comodity")
public interface CommodityService {

    @RequestMapping(value = "/detail/{id}")
    public CommodityDetailVO getDetail(@PathVariable(value = "id") Long id);
}
