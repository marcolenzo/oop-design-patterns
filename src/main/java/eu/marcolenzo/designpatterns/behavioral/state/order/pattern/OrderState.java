package eu.marcolenzo.designpatterns.behavioral.state.order.pattern;

public interface OrderState {

  default void confirm(Order order) {
    throw new UnsupportedOperationException("Operation not supported");
  }

  default void ship(Order order) {
    throw new UnsupportedOperationException("Operation not supported");
  }

  default void cancel(Order order) {
    throw new UnsupportedOperationException("Operation not supported");
  }

  default void deliver(Order order) {
    throw new UnsupportedOperationException("Operation not supported");
  }

  default void lost(Order order) {
    throw new UnsupportedOperationException("Operation not supported");
  }

  default void refund(Order order) {
    throw new UnsupportedOperationException("Operation not supported");
  }

}
