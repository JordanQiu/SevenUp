package org.sevenup.rest.controller.order;

import org.sevenup.event.order.OrderStatusEvent;
import org.sevenup.event.order.RequestOrderStatusEvent;
import org.sevenup.rest.domain.order.OrderStatus;
import org.sevenup.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/aggregators/orders/{id}/status")
public class OrderStatusController {

  @Autowired
  private OrderService orderService;

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<OrderStatus> getOrderStatus(@PathVariable String id) {

    OrderStatusEvent orderStatusEvent = orderService.requestOrderStatus(new RequestOrderStatusEvent(UUID.fromString(id)));

    if (!orderStatusEvent.isEntityFound()) {
      return new ResponseEntity<OrderStatus>(HttpStatus.NOT_FOUND);
    }

    return new ResponseEntity<OrderStatus>(
            OrderStatus.fromOrderStatusDetails(
                    orderStatusEvent.getKey(),
                    orderStatusEvent.getOrderStatus()),
            HttpStatus.OK);
  }
}
