package myVersion;

public interface Subject {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
