package com.github.alexv1993;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.*;

/**
 * Created by Alex on 08.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TreeMap<Integer, String> states = (TreeMap<Integer, String>) context.getBean("states");
        ConnectionAppImpl<Integer, String> connectionApp = (ConnectionAppImpl<Integer, String>) context.getBean("connectionApp");


        String first = states.get(2);
        System.out.println(first);

        connectionApp.printTreeMap(states);


        System.out.println("----------Print all Keys----------");
        Set<Integer> set = connectionApp.getKeys(states);
        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()) {
            Integer key = integerIterator.next();
            System.out.println(key);
        }

        System.out.println("----------Print all Values----------");
        Collection<String> collection = connectionApp.getValues(states);
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println("----------Print all After 4----------");
        Map<Integer, String> afterMap = connectionApp.getAfterMap(states, 4);
        for (Map.Entry<Integer, String> entry : afterMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("----------Print all Before 10----------");
        Map<Integer, String> beforeMap = connectionApp.getBeforeMap(states, 10);
        for (Map.Entry<Integer, String> entry : beforeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println("----------Print last element----------");
        Map.Entry<Integer, String> entry = connectionApp.getLastElm(states);
        System.out.println(entry.getKey() + " " + entry.getValue());


        System.out.println("----------Print people map----------");
        TreeMap<String, Person> people = (TreeMap<String, Person>) context.getBean("people");
        for (Map.Entry<String, Person> entry1 : people.entrySet()) {
            System.out.println(entry1.getKey() + " " + entry1.getValue());
        }


    }

}
