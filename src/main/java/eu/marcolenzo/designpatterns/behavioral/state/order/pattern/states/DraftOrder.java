package eu.marcolenzo.designpatterns.behavioral.state.order.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.order.pattern.Order;
import eu.marcolenzo.designpatterns.behavioral.state.order.pattern.OrderState;

public class DraftOrder implements OrderState {

  @Override
  public void confirm(Order order) {
    order.setState(new ConfirmedOrder());
    System.out.println("The order has been confirmed");
  }

  @Override
  public void cancel(Order order) {
    order.setState(new CancelledOrder());
    System.out.println("The order has been canceled");
  }

}
