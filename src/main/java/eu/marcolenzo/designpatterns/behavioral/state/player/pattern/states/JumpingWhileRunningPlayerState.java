package eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.Player;

public class JumpingWhileRunningPlayerState extends AbstractPlayerState {

  private int loopsActive = 0;

  @Override
  public void onLoop(Player player) {
    if (loopsActive >= 5) {
      System.out.println("Running");
      player.setState(new RunningPlayerState());
    }
    loopsActive++;
  }

  @Override
  public void shoot(Player player) {
    int accuracy =
        fullAccuracy - noAimingAccuracyPenalty - runningAccuracyPenalty - jumpingAccuracyPenalty;
    System.out.println("Shooting with " + accuracy + "% accuracy.");
  }


}
