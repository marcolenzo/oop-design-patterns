package eu.marcolenzo.designpatterns.behavioral.state.order.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.order.pattern.Order;
import eu.marcolenzo.designpatterns.behavioral.state.order.pattern.OrderState;

public class ConfirmedOrder implements OrderState {

  @Override
  public void ship(Order order) {
    order.setState(new ShippedOrder());
    System.out.println("The order has been shipped");
  }

  @Override
  public void cancel(Order order) {
    order.setState(new CancelledOrder());
    System.out.println("The order has been canceled");
  }

}
