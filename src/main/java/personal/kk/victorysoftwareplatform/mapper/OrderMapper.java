package personal.kk.victorysoftwareplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import personal.kk.victorysoftwareplatform.entity.Order;
import personal.kk.victorysoftwareplatform.entity.User;

import java.util.List;

/**
 * @author kk
 * @description 201订单mapper层
 * @date 2024-5-17 15:29:12
 */

public interface OrderMapper extends BaseMapper<Order> {
    @Select("select * from STfk240517 where 销售订单号 =  #{orderid}  ")
    Order getByOrderId(String orderid);
}
