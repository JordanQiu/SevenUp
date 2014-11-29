package org.sevenup.event.order;

import java.util.UUID;

import org.sevenup.event.DeleteEvent;

public class DeleteOrderEvent extends DeleteEvent {

  private final UUID key;

  public DeleteOrderEvent(final UUID key) {
    this.key = key;
  }

  public UUID getKey() {
    return key;
  }
}
