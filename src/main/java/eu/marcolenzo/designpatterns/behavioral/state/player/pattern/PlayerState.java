package eu.marcolenzo.designpatterns.behavioral.state.player.pattern;

public interface PlayerState extends LoopAware<Player> {

  default void walk(Player player) {
  }

  default void run(Player player) {
  }

  default void jump(Player player) {
  }

  default void stop(Player player) {
  }

  default void aim(Player player) {
  }

  default void shoot(Player player) {
  }

}
