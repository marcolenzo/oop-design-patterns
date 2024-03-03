package eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.Player;

public class StillPlayerState extends AbstractPlayerState {

  @Override
  public void walk(Player player) {
    System.out.println("Walking");
    player.setState(new WalkingPlayerState());
  }

  @Override
  public void jump(Player player) {
    System.out.println("Jumping");
    player.setAiming(false);
    player.setState(new JumpingPlayerState());
  }

  @Override
  public void aim(Player player) {
    System.out.println("Aiming");
    player.setAiming(true);
  }

  @Override
  public void shoot(Player player) {
    int accuracy = player.isAiming() ? fullAccuracy : fullAccuracy - noAimingAccuracyPenalty;
    System.out.println("Shooting with " + accuracy + "% accuracy.");
  }


}
