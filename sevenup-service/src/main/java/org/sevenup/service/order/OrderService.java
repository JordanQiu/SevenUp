package org.sevenup.service.order;

import org.sevenup.event.order.AllOrdersEvent;
import org.sevenup.event.order.CreateOrderEvent;
import org.sevenup.event.order.DeleteOrderEvent;
import org.sevenup.event.order.OrderCreatedEvent;
import org.sevenup.event.order.OrderDeletedEvent;
import org.sevenup.event.order.OrderDetailsEvent;
import org.sevenup.event.order.OrderStatusEvent;
import org.sevenup.event.order.OrderUpdatedEvent;
import org.sevenup.event.order.RequestAllOrdersEvent;
import org.sevenup.event.order.RequestOrderDetailsEvent;
import org.sevenup.event.order.RequestOrderStatusEvent;
import org.sevenup.event.order.SetOrderPaymentEvent;


//TODOCUMENT THis is an event driven service.
// Used to interact with the core domain.
//All methods are guaranteed to return something, null will never be returned.
public interface OrderService {

  public AllOrdersEvent requestAllOrders(RequestAllOrdersEvent requestAllCurrentOrdersEvent);

  public OrderDetailsEvent requestOrderDetails(RequestOrderDetailsEvent requestOrderDetailsEvent);

  public OrderStatusEvent requestOrderStatus(RequestOrderStatusEvent requestOrderStatusEvent);

  public OrderCreatedEvent createOrder(CreateOrderEvent event);

  public OrderUpdatedEvent setOrderPayment(SetOrderPaymentEvent setOrderPaymentEvent);

  public OrderDeletedEvent deleteOrder(DeleteOrderEvent deleteOrderEvent);
}
