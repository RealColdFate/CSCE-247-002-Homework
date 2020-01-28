import java.util.ArrayList;

//Andrew Merrill 

// the subject to be watched by the observers Mom and Dad
public class Baby implements Subject {
  private ArrayList<Observer> observers;
  private Cry cry;

  public Baby() {
    System.out.println("A baby is born");
  }


  // adds an observer to the ArrayList keeping track of observers
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  // removes an observer from the ArrayList keeping track of the observers
  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  // prints to the console for the cry the baby is crying
  public void notifyObservers() {
    switch(this.cry) {
      case ANGRY_CRY:
        System.out.println("This baby is angry!");
        break;
      case WET_CRY:
        System.out.println("This baby is wet");
        break;
      case HUNGRY_CRY:
        System.out.println("This baby is hungry");
    }
  }

  // updates the cry and notifies the parent
  public void angryCry() {
    this.cry = Cry.ANGRY_CRY;
    notifyObservers();
  }

  // updates the cry and notifies the parent
  public void hungryCry() {
    this.cry = Cry.HUNGRY_CRY;
    notifyObservers();
  }

  // updates the cry and notifies the parent
  public void wetCry() {
    this.cry = Cry.WET_CRY;
    notifyObservers();
  }

}
