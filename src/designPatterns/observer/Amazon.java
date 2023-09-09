package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscriberList; //SET
    List<OrderCancelledSubscriber> orderCancelledSubscribers; //SET
    // HashMap
    // key event name, value list of subscribers for that event

    public Amazon() {
        this.orderPlacedSubscriberList = new ArrayList<>();
        this.orderCancelledSubscribers = new ArrayList<>();
    }

    public void register(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void deRegister(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    //add another register and deregister for orderCancelledSubscribers

    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscriberList){
            orderPlacedSubscriber.onOrderPlaceAction();
        }
    }

    public void orderCancel(){
        for(OrderCancelledSubscriber orderCancelledSubscriber : orderCancelledSubscribers){
            orderCancelledSubscriber.onOrderCancelledAction();
        }
    }

}

//break -> 9:50 PM -> 6 mins