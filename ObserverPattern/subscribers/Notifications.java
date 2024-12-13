package ObserverPattern.subscribers;

import ObserverPattern.Amazon;
import ObserverPattern.OrderAction;

public class Notifications implements OrderAction{

    public Notifications() {
        Amazon.getInstance().addSubscriber(this);
    }

    @Override
    public void orderAction() {
        System.out.println("Client notified.");
    }
    
}
