package observer;

import java.util.Observable;

public class MyObservable extends Observable {

    public void notifyTest(String msg){
        setChanged();
        notifyObservers(msg);
    }
}
