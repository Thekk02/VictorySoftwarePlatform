package personal.kk.victorysoftwareplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import personal.kk.victorysoftwareplatform.entity.Order;
import personal.kk.victorysoftwareplatform.mapper.OrderMapper;
import personal.kk.victorysoftwareplatform.service.OrderService;
import personal.kk.victorysoftwareplatform.service.impl.OrderServiceImpl;
import personal.kk.victorysoftwareplatform.utils.Result;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author kk
 * @description 201订单控制层
 * @date 2024-5-17 15:33:41
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderservice;

//    @GetMapping("/getby??orderid={OrderId}&DrawingNumber={DrawingNumber}")
//    public List<Order> getBy(@PathVariable("OrderId") String OrderId,@PathVariable("DrawingNumber") String DrawingNumber){
//
//        return orderservice.getBy(OrderId, DrawingNumber);
//    }
    @GetMapping("/getall")
    @ResponseBody
    public Result<List<Order>> getall(){
        return Result.ok(orderservice.list());
    }

    @GetMapping("/getbyorderid={orderid}")
    @ResponseBody
    public Result<Order> getByOrderId(@PathVariable("orderid") String orderid){
        orderid = "'" + orderid + "'";
        return Result.ok(orderservice.getByOrderId(orderid));
    }

}
