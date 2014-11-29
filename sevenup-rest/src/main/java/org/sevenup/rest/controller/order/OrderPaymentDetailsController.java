package org.sevenup.rest.controller.order;

import org.sevenup.rest.domain.order.PaymentDetails;
import org.sevenup.service.order.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aggregators/orders/{id}/paymentdetails")
public class OrderPaymentDetailsController {

  private OrderService orderService;

  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }

  @RequestMapping(method = RequestMethod.GET)
  public
  @ResponseBody
  PaymentDetails getPaymentDetails(@PathVariable String id) {
    //TODO obtain the order
    //TODO ensure payment details mapping is correct

    return null;
  }

  @RequestMapping(method = RequestMethod.PUT)
  public
  @ResponseBody
  PaymentDetails updatePaymentDetails(@PathVariable String id) {
    //TODO use a command object?
    //TODO obtain the order
    //TODO update the order payment details.
    //TODO ensure payment details mapping is correct

    return null;
  }
}
