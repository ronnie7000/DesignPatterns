package ObserverPattern.subscribers;

import ObserverPattern.Amazon;
import ObserverPattern.OrderAction;

public class Invoicing implements OrderAction{

    public Invoicing() {
        Amazon.getInstance().addSubscriber(this);
    }

    @Override
    public void orderAction() {
        System.out.println("Invoicing in progress.");
    }
    
}
