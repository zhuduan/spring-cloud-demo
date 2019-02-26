package com.zhuduan.cloud.demo.order.controller;

import com.zhuduan.cloud.demo.order.feign.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Order controller
 *
 * @author Haifeng.Zhu
 * created at 2/26/19
 */
@Api(description = "get the details of order")
@RestController()
@RequestMapping(value = "detail")
public class DetailController {
    
    @Autowired
    private CommodityService commodityService;

//    @ApiOperation(httpMethod = "GET", value = "get the details by id", response = OrderDetailVO.class)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getDetail(@PathVariable Long id) {
//        OrderDetailVO orderDetailVO = new OrderDetailVO();
//        orderDetailVO.setId(id);
//        orderDetailVO.setName("name"+id);
//        orderDetailVO.setCommodityDetail(commodityService.getDetail(1L));
        
        return "get " + commodityService.getDetail(1L);
    }
}
