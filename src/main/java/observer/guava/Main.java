package observer.guava;

import com.google.common.eventbus.EventBus;

public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("全军出击");
    }
}
