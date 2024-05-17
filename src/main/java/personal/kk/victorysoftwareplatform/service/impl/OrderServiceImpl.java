package personal.kk.victorysoftwareplatform.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import personal.kk.victorysoftwareplatform.entity.Order;
import personal.kk.victorysoftwareplatform.entity.User;
import personal.kk.victorysoftwareplatform.mapper.OrderMapper;
import personal.kk.victorysoftwareplatform.mapper.UserMapper;
import personal.kk.victorysoftwareplatform.service.OrderService;
import personal.kk.victorysoftwareplatform.service.UserService;

import java.util.List;

/**
 * @author kk
 * @description 201订单服务实现层
 * @date 2024-5-17 15:31:21
 */
@Service
@DS("db3")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {


    @Override
    public List<Order> getAll() {
        return null;
    }
}
