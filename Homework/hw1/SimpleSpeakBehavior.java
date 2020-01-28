import java.util.Random;


public class SimpleSpeakBehavior implements TalkBehavior {

  public String talk() {
    Random rand = new Random();
    int option = rand.nextInt(5);
    switch(option) {
      case 0:
        return "Eva?";

      case 1:
        return "Wall-E";

      case 2:
        return "EVA!";

      case 3:
        return "Pop";

      case 4:
        return "Eee-va?";

      default:
        return "Oh dear, I messed up the randoms in SimpleSpeakBehavior";
    }
  }
}
