package eu.marcolenzo.designpatterns.behavioral.state.player.pattern;

import java.io.IOException;
import java.util.Scanner;

public class GameLoopLauncher {

  public static void main(String[] args) throws IOException {

    Player player = new Player();
    boolean exit = false;

    displayControls();

    while (!exit) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      switch (input) {
        case "w" -> player.getState().walk(player);
        case "r" -> player.getState().run(player);
        case "j" -> player.getState().jump(player);
        case "s" -> player.getState().stop(player);
        case "a" -> player.getState().aim(player);
        case "x" -> player.getState().shoot(player);
        case "q" -> exit = true;
        default -> {
          System.out.println("Invalid key");
        }
      }
      player.getState().onLoop(player);
    }

    System.out.println("Exiting...");
  }

  static void displayControls() {
    System.out.println("""
        Game controls:
        - w: walk
        - r: run
        - j: jump
        - s: stop
        - a: aim
        - x: shoot
        - q: quit""");
  }


}
