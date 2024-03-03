package eu.marcolenzo.designpatterns.behavioral.state.order.pattern;

import eu.marcolenzo.designpatterns.behavioral.state.order.pattern.states.DraftOrder;

public class Order {

  private OrderState state;

  public Order() {
    this.state = new DraftOrder();
  }

  public void confirmRequest() {
    state.confirm(this);
  }

  public void cancelRequest() {
    state.cancel(this);
  }

  public void shipRequest() {
    state.ship(this);
  }

  public void deliverRequest() {
    state.deliver(this);
  }

  public void lostRequest() {
    state.lost(this);
  }

  public void refundRequest() {
    state.refund(this);
  }

  public OrderState getState() {
    return state;
  }

  public void setState(OrderState state) {
    this.state = state;
  }

}
