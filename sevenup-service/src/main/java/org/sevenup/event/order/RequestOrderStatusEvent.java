package org.sevenup.event.order;


import java.util.UUID;

import org.sevenup.event.RequestReadEvent;

public class RequestOrderStatusEvent extends RequestReadEvent {
  private UUID key;

  public RequestOrderStatusEvent(UUID key) {
    this.key = key;
  }

  public UUID getKey() {
    return key;
  }
}
