package com.rahul.Exercise20Aug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private static  Map<Customer, Boolean> mapCustomers = new HashMap<>();
    private static  Map<Tshirt, Integer> mapTshirts = new HashMap<>();
    private static Map<Customer, Tshirt> mapPurchases = new HashMap<>();

    public static Customer addCustomer(String name){
        Customer c = new Customer();
        c.setName(name);
        mapCustomers.put(c, true);
        return c;
    }

    public static Tshirt addTshirt(String type){
        Tshirt tshirt = new Tshirt();
        tshirt.setType(type);
        mapTshirts.put(tshirt, 100);
        return tshirt;
    }

    public static Purchase addPurchase(Customer c, Tshirt t){
        mapPurchases.put(c, t);
        Purchase p = new Purchase();
        p.setQuantity(1);
        p.setTshirt(t);
        p.setCustomer(c);
        return p;
    }

    public static void main(String[] args) {

    }
}
