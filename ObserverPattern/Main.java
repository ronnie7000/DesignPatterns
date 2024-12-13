package ObserverPattern;

import ObserverPattern.subscribers.Invoicing;
import ObserverPattern.subscribers.Logistics;
import ObserverPattern.subscribers.Notifications;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        Logistics logistics = new Logistics();
        Notifications notifications = new Notifications(); 
        Invoicing invoicing = new Invoicing();

        amazon.markOrderAction();
    }
}