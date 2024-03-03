package eu.marcolenzo.designpatterns.behavioral.state.player.pattern;

import eu.marcolenzo.designpatterns.behavioral.state.player.pattern.states.StillPlayerState;

public class Player {

  private boolean aiming = false;

  private PlayerState state = new StillPlayerState();

  public boolean isAiming() {
    return aiming;
  }

  public void setAiming(boolean aiming) {
    this.aiming = aiming;
  }

  public PlayerState getState() {
    return state;
  }

  public void setState(PlayerState state) {
    this.state = state;
  }

}
