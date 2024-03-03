package eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.Player;

public class RunningPlayerState extends AbstractPlayerState {

  @Override
  public void jump(Player player) {
    System.out.println("Jumping");
    player.setState(new JumpingWhileRunningPlayerState());
  }

  @Override
  public void walk(Player player) {
    System.out.println("Walking");
    player.setState(new WalkingPlayerState());
  }

  @Override
  public void shoot(Player player) {
    int accuracy = fullAccuracy - noAimingAccuracyPenalty - runningAccuracyPenalty;
    System.out.println("Shooting with " + accuracy + "% accuracy.");
  }
}
