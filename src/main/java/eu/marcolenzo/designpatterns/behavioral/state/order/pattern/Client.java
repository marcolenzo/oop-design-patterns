package eu.marcolenzo.designpatterns.behavioral.state.order.pattern;

import java.util.List;

public class Client {


  public static void main(String[] args) {
    List<Runnable> tasks = List.of(
        Client::deliveredOrder,
        Client::cancelledOrder,
        Client::userCancelsDraftOrder,
        Client::userCancelsShippedOrder,
        Client::warehouseMarksDeliveredUnshippedOrder
    );

    for (Runnable task : tasks) {
      try {
        task.run();
      } catch (UnsupportedOperationException e) {
        System.out.println("ERROR: " + e.getMessage());
      }
    }

  }

  static void deliveredOrder() {
    System.out.println("\n### Complete order flow ###");
    Order order = new Order();
    // User confirms the order
    order.confirmRequest();
    // Warehouse manager marks the order as shipped
    order.shipRequest();
    // Logistics marks the order as delivered
    order.deliverRequest();
  }

  static void cancelledOrder() {
    System.out.println("\n### User cancels confirmed order ###");
    Order order = new Order();
    // User confirms the order
    order.confirmRequest();
    // User cancels the order
    order.cancelRequest();
  }

  static void userCancelsDraftOrder() {
    System.out.println("\n### User cancels draft order ###");
    Order order = new Order();
    // User tries to cancel the order
    order.cancelRequest();
  }

  static void userCancelsShippedOrder() {
    System.out.println("\n### User cancels shipped order ###");
    Order order = new Order();
    // User confirms the order
    order.confirmRequest();
    // Warehouse manager marks the order as shipped
    order.shipRequest();
    // User tries to cancel the order
    order.cancelRequest();
  }

  static void warehouseMarksDeliveredUnshippedOrder() {
    System.out.println("\n### Warehouse marks delivered unshipped order ###");
    Order order = new Order();
    // User confirms the order
    order.confirmRequest();
    // Warehouse manager marks the order as delivered
    order.deliverRequest();
  }


}
