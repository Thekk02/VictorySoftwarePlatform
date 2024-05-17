package personal.kk.victorysoftwareplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.kk.victorysoftwareplatform.entity.Order;

import java.util.List;

/**
 * @author kk
 * @description 201订单mapper层
 * @date 2024-5-17 15:29:59
 */
public interface OrderService extends IService<Order> {
    List<Order> getAll();
}
