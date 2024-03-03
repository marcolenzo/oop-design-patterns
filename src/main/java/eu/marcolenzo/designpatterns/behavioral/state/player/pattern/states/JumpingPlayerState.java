package eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.Player;

public class JumpingPlayerState extends AbstractPlayerState {

  private int loopsActive = 0;

  @Override
  public void onLoop(Player player) {
    if (loopsActive >= 2) {
      System.out.println("Still");
      player.setState(new StillPlayerState());
    }
    loopsActive++;
  }

  @Override
  public void shoot(Player player) {
    int accuracy = fullAccuracy - noAimingAccuracyPenalty - jumpingAccuracyPenalty;
    System.out.println("Shooting with " + accuracy + "% accuracy.");
  }

}
