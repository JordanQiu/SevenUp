package org.sevenup.event.order;


import java.util.UUID;

import org.sevenup.event.RequestReadEvent;

public class RequestOrderDetailsEvent extends RequestReadEvent {
  private UUID key;

  public RequestOrderDetailsEvent(UUID key) {
    this.key = key;
  }

  public UUID getKey() {
    return key;
  }
}
