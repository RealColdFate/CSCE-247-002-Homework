import java.util.Random;


public class SpeakBehavior implements TalkBehavior {

  public String talk() {
    Random rand = new Random();
    int option = rand.nextInt(3);
    switch(option) {
      case 0:
        return "Hello";

      case 1:
        return "How are you?";

      case 2:
        return "Good day";

      default:
        return "Oh dear, I messed up the randoms in SpeakBehavior";
    }
  }
}
