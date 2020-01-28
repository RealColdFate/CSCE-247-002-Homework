// Andrew Merrill 
// interface to describe the classes that are being watched by the observers
public interface Subject {

  public void registerObserver(Observer observer);

  public void removeObserver(Observer observer);

  public void notifyObservers();

}
