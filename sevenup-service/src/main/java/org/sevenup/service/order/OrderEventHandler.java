package org.sevenup.service.order;


import java.util.*;

import org.sevenup.domain.Order;
import org.sevenup.domain.OrderStatus;
import org.sevenup.event.order.AllOrdersEvent;
import org.sevenup.event.order.CreateOrderEvent;
import org.sevenup.event.order.DeleteOrderEvent;
import org.sevenup.event.order.OrderCreatedEvent;
import org.sevenup.event.order.OrderDeletedEvent;
import org.sevenup.event.order.OrderDetails;
import org.sevenup.event.order.OrderDetailsEvent;
import org.sevenup.event.order.OrderStatusEvent;
import org.sevenup.event.order.OrderUpdatedEvent;
import org.sevenup.event.order.RequestAllOrdersEvent;
import org.sevenup.event.order.RequestOrderDetailsEvent;
import org.sevenup.event.order.RequestOrderStatusEvent;
import org.sevenup.event.order.SetOrderPaymentEvent;
import org.springframework.stereotype.Service;
@Service
public class OrderEventHandler implements OrderService {

//  private final OrdersRepository ordersRepository;
//
//  public OrderEventHandler(final OrdersRepository ordersRepository) {
//    this.ordersRepository = ordersRepository;
//  }

  @Override
  public OrderCreatedEvent createOrder(CreateOrderEvent createOrderEvent) {
    Order order = Order.fromOrderDetails(createOrderEvent.getDetails());

    order.addStatus(new OrderStatus(new Date(), "Order Created"));

//    order = ordersRepository.save(order);

    return new OrderCreatedEvent(order.getKey(), order.toOrderDetails());
  }

  @Override
  public AllOrdersEvent requestAllOrders(RequestAllOrdersEvent requestAllCurrentOrdersEvent) {
    List<OrderDetails> generatedDetails = new ArrayList<OrderDetails>();
//    for (Order order : ordersRepository.findAll()) {
//      generatedDetails.add(order.toOrderDetails());
//    }
    return new AllOrdersEvent(generatedDetails);
  }

  @Override
  public OrderDetailsEvent requestOrderDetails(RequestOrderDetailsEvent requestOrderDetailsEvent) {

//    Order order = ordersRepository.findById(requestOrderDetailsEvent.getKey());

//    if (order == null) {
//      return OrderDetailsEvent.notFound(requestOrderDetailsEvent.getKey());
//    }
//
//    return new OrderDetailsEvent(
//            requestOrderDetailsEvent.getKey(),
//            order.toOrderDetails());
	  return null;
  }

  @Override
  public OrderUpdatedEvent setOrderPayment(SetOrderPaymentEvent setOrderPaymentEvent) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public OrderDeletedEvent deleteOrder(DeleteOrderEvent deleteOrderEvent) {

//    Order order = ordersRepository.findById(deleteOrderEvent.getKey());
	  Order order = null;
    if (order == null) {
      return OrderDeletedEvent.notFound(deleteOrderEvent.getKey());
    }

    OrderDetails details = order.toOrderDetails();

    //TODOCUMENT This contains some specific domain logic, not exposed to the outside world, and not part of the
    //persistence rules.

    if (!order.canBeDeleted()) {
      return OrderDeletedEvent.deletionForbidden(deleteOrderEvent.getKey(), details);
    }

//    ordersRepository.delete(deleteOrderEvent.getKey());
    return new OrderDeletedEvent(deleteOrderEvent.getKey(), details);
  }

  @Override
  public OrderStatusEvent requestOrderStatus(RequestOrderStatusEvent requestOrderDetailsEvent) {
//    Order order = ordersRepository.findById(requestOrderDetailsEvent.getKey());

//    if (order == null) {
//      return OrderStatusEvent.notFound(requestOrderDetailsEvent.getKey());
//    }
//
//    return new OrderStatusEvent(requestOrderDetailsEvent.getKey(), order.getStatus().toStatusDetails());
	  return null;
  }
}
