package observer;

public class Main {
    public static void main(String[] args) {
        MyObservable myObservable = new MyObservable();
        MyObserver observer1 = new MyObserver();
        MyObserver observer2 = new MyObserver();

        myObservable.addObserver(observer1);
        myObservable.addObserver(observer2);

        myObservable.notifyTest("全军出击");
    }
}
