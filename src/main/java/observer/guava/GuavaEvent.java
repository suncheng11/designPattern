package observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    public void subscribe(String msg){
        System.out.println("copy that:" + msg);
    }
}
