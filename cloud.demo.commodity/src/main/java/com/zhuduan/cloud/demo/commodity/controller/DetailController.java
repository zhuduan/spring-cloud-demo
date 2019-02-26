package com.zhuduan.cloud.demo.commodity.controller;

import cloud.demo.pojo.vo.CommodityDetailVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * details
 *
 * @author Haifeng.Zhu
 * created at 2/26/19
 */
@Api(description = "get the details of commodity")
@RestController()
@RequestMapping(value = "detail")
public class DetailController {

    @ApiOperation(httpMethod = "GET", value = "get the details by id", response = CommodityDetailVO.class)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommodityDetailVO getDetail(@PathVariable Long id) {
        return new CommodityDetailVO(id, ("name"+id));
    }
}
