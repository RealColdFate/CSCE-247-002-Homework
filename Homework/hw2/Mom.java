// Andrew Merrill 
// a child of Observer who will observe a baby
public class Mom implements Observer {
  // instance variable to interface with the subject
  private Subject baby;

  public Mom(Subject baby) {
    this.baby = baby;
  }

  // updates the mom to print out what she will do when the baby cries
  public void update(Cry cry) {
    switch(cry) {
      case ANGRY_CRY:
        System.out.println("Mom hugs and rocks baby, maybe spoiling");
        break;
      case WET_CRY:
        System.out.println("Mom changes baby");
        break;
      case HUNGRY_CRY:
        System.out.println("Mom cuddles and feeds baby");
    }
  }

}
