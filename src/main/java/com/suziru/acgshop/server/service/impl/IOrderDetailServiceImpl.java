package com.suziru.acgshop.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suziru.acgshop.pojo.entity.Order;
import com.suziru.acgshop.pojo.entity.OrderDetail;
import com.suziru.acgshop.server.mapper.OrderDetailMapper;
import com.suziru.acgshop.server.mapper.OrderMapper;
import com.suziru.acgshop.server.service.IOrderDetailService;
import com.suziru.acgshop.server.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 订单细表Service实现类

 */

/**
 * 订单细表Service实现类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-11-23 9:08
 */
@Service("orderDetailService")
public class IOrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper,OrderDetail> implements IOrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

}