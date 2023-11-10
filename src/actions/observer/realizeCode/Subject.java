package actions.observer.realizeCode;

import sun.plugin2.message.Message;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Message message);
}
