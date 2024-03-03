package eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.Player;
import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.PlayerState;

public class AbstractPlayerState implements PlayerState {

  protected final int fullAccuracy = 100;
  protected final int noAimingAccuracyPenalty = 20;
  protected final int walkingAccuracyPenalty = 10;
  protected final int runningAccuracyPenalty = 25;
  protected final int jumpingAccuracyPenalty = 30;

  @Override
  public void onLoop(Player player) {
    // do nothing
  }
  
}
