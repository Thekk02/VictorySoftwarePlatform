package personal.kk.victorysoftwareplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Select;
import personal.kk.victorysoftwareplatform.entity.Order;

import java.util.List;

/**
 * @author kk
 * @description 201订单mapper层
 * @date 2024-5-17 15:29:59
 */
public interface OrderService extends IService<Order> {
    List<Order> getAll();

    @Select("select * from STfk240517 where 销售订单号 = #{orderid} ")
    Order getByOrderId(String orderid);
}
