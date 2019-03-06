package com.zhuduan.cloud.demo.order.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhuduan.cloud.demo.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * Order Service
 *
 * @author Haifeng.Zhu
 * created at 3/6/19
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Override
    @HystrixCommand(fallbackMethod = "defaultGetOrderInfo", groupKey = "orderGroup", commandKey = "info")
    public String getOrderInfo() throws Exception{
        throw new Exception("some exceptions");
    }
    
    public String defaultGetOrderInfo(){
        return "default";
    }
}
