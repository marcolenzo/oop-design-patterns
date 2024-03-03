package eu.marcolenzo.designpatterns.behavioral.state.order.nopattern;

public class Order {

  private OrderState state;

  public Order() {
    this.state = OrderState.DRAFT;
  }

  public void confirm() {
    if (state == OrderState.DRAFT) {
      state = OrderState.CONFIRMED;
      System.out.println("The order has been confirmed");
    } else {
      throwUnsupportedOperationException();
    }
  }

  public void cancel() {
    if (state == OrderState.DRAFT || state == OrderState.CONFIRMED) {
      state = OrderState.CANCELLED;
      System.out.println("The order has been canceled");
    } else {
      throwUnsupportedOperationException();
    }
  }

  public void ship() {
    if (state == OrderState.CONFIRMED) {
      state = OrderState.SHIPPED;
      System.out.println("The order has been shipped");
    } else {
      throwUnsupportedOperationException();
    }
  }

  public void deliver() {
    if (state == OrderState.SHIPPED) {
      state = OrderState.DELIVERED;
      System.out.println("The order has been delivered");
    } else {
      throwUnsupportedOperationException();
    }
  }

  public void lost() {
    if (state == OrderState.SHIPPED) {
      state = OrderState.LOST;
      System.out.println("The order has been lost");
    } else {
      throwUnsupportedOperationException();
    }
  }

  public void refund() {
    if (state == OrderState.LOST) {
      state = OrderState.REFUNDED;
      System.out.println("The order has been refunded");
    } else {
      throwUnsupportedOperationException();
    }
  }


  public OrderState getState() {
    return state;
  }

  private void throwUnsupportedOperationException() {
    throw new UnsupportedOperationException("Cannot confirm " + state + " order");
  }

}
