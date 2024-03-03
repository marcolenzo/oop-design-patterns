package eu.marcolenzo.designpatterns.behavioral.state.door;

public class Door {

  boolean locked;
  boolean closed;

  public Door() {
    locked = true;
    closed = true;
  }

  // can open only if closed or not locked
  public boolean canOpen() {
    return closed && !locked;
  }

  // can close only if open and not locked
  public boolean canClose() {
    return !closed && !locked;
  }

  // can lock only if closed and not locked
  public boolean canLock() {
    return closed && !locked;
  }

  // can unlock only if closed and locked
  public boolean canUnlock() {
    return closed && locked;
  }

  public boolean isClosed() {
    return closed;
  }

  // Danger: this setter can create an invalid state!
  public void setClosed(boolean closed) {
    this.closed = closed;
  }

  public boolean isLocked() {
    return locked;
  }

  // Danger: this setter can create an invalid state!
  public void setLocked(boolean locked) {
    this.locked = locked;
  }
}
