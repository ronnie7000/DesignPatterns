package ObserverPattern.subscribers;

import ObserverPattern.Amazon;
import ObserverPattern.OrderAction;

public class Logistics implements OrderAction{

    public Logistics() {
        Amazon.getInstance().addSubscriber(this);
    }

    @Override
    public void orderAction() {
        System.out.println("Logistics are ready.");
    }
    
}
