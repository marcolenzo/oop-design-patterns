package eu.marcolenzo.designpatterns.behavioral.state.order.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.order.pattern.Order;
import eu.marcolenzo.designpatterns.behavioral.state.order.pattern.OrderState;

public class ShippedOrder implements OrderState {

  @Override
  public void deliver(Order order) {
    System.out.println("The order has been delivered");
    order.setState(new DeliveredOrder());
  }

}
