public class WallERobot extends Robot {
  WallERobot(String name) {
    super(name);
    talkBehavior = new SimpleSpeakBehavior();
    moveBehavior = new WalkBehavior();
  }

  public String toString() {
    return name + " is an environmentally friendly Wall-E Robot";
  }
}
