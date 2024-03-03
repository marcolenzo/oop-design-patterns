package eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.Player;

public class WalkingPlayerState extends AbstractPlayerState {

  @Override
  public void jump(Player player) {
    System.out.println("Jumping");
    player.setAiming(false);
    player.setState(new JumpingWhileWalkingPlayerState());
  }

  @Override
  public void run(Player player) {
    System.out.println("Running");
    player.setAiming(false);
    player.setState(new RunningPlayerState());
  }

  @Override
  public void aim(Player player) {
    System.out.println("Aiming");
    player.setAiming(true);
  }

  @Override
  public void shoot(Player player) {
    int accuracy = player.isAiming() ? fullAccuracy - walkingAccuracyPenalty
        : fullAccuracy - noAimingAccuracyPenalty - walkingAccuracyPenalty;
    System.out.println("Shooting with " + accuracy + "% accuracy.");
  }

  @Override
  public void stop(Player player) {
    System.out.println("Still");
    player.setState(new StillPlayerState());
  }
}
