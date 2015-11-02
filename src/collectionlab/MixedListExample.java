/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MCENDROWSKI
 */
public class MixedListExample {

    public static void main(String[] args) {
        List mixedList = new ArrayList();

        mixedList.add(new Employee("Ventura", "Ace", "123456789"));
        mixedList.add(new Employee("Turner", "Scott", "234567890"));
        mixedList.add(new Dog("Hooch", 1234));
        mixedList.add(new Dog("Beethoven", 5678));

        for (Object object : mixedList) {
            String obj = object.toString();
            System.out.println(obj);
        }
    }
}
