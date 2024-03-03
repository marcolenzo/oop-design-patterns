package eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.Player;

public class JumpingWhileWalkingPlayerState extends AbstractPlayerState {

  private int loopsActive = 0;

  @Override
  public void onLoop(Player player) {
    if (loopsActive >= 3) {
      System.out.println("Walking");
      player.setState(new WalkingPlayerState());
    }
    loopsActive++;
  }

  @Override
  public void shoot(Player player) {
    int accuracy =
        fullAccuracy - noAimingAccuracyPenalty - walkingAccuracyPenalty - jumpingAccuracyPenalty;
    System.out.println("Shooting with " + accuracy + "% accuracy.");
  }
}
