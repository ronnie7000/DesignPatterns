package ObserverPattern;

import java.util.ArrayList;

public class Amazon {
    
    private static Amazon instance = null;
    private ArrayList<OrderAction> subscribers;

    private Amazon() {
        subscribers = new ArrayList<>();
    }
    
    public static Amazon getInstance() {
        if(instance == null) {
            synchronized(Amazon.class) {
                if(instance == null) {
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void addSubscriber(OrderAction orderAction) {
        subscribers.add(orderAction);
    }

    public void removeSubscriber(OrderAction orderAction) {
        subscribers.remove(orderAction);
    }

    public void markOrderAction() {
        for(OrderAction subscriber : subscribers) {
            subscriber.orderAction();
        }
    }
}
