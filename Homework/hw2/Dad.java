// Andrew Merrill 
// A class that is an observer
public class Dad implements Observer {
  // instance variable of this observers subject
  private Subject baby;

  public Dad(Subject baby) {
    this.baby = baby;

  }

  // prints out what the dad class will do when notified of a cry
  public void update(Cry cry) {
    switch(cry) {
      case ANGRY_CRY:
        System.out.println("Dad puts in earplugs");
        break;
      case WET_CRY:
        System.out.println("Dad calls mom");
        break;
      case HUNGRY_CRY:
        System.out.println("Dad feeds baby");
    }
  }
}
