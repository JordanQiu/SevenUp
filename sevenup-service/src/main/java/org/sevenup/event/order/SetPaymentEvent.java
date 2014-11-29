package org.sevenup.event.order;


import java.util.UUID;

import org.sevenup.event.UpdateEvent;

public class SetPaymentEvent extends UpdateEvent {

  private UUID key;
  private OrderDetails orderDetails;

  public SetPaymentEvent(UUID key, OrderDetails orderDetails) {
    this.key = key;
    this.orderDetails = orderDetails;
  }

  public UUID getKey() {
    return key;
  }

  public OrderDetails getOrderDetails() {
    return orderDetails;
  }
}
