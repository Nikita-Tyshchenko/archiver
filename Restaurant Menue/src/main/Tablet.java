package main;

import kitchen.Order;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet {

    private final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tablet{number=" + number + '}';
    }


    public void createOrder(){
        Order order;
        try{
            order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
        } catch (IOException ioException) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
    }
}