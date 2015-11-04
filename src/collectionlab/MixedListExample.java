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

        for (int i = 0; i < mixedList.size(); i++) {
            Object object = mixedList.get(i);

            if (object instanceof Employee) {
                System.out.println(((Employee) object).getFirstName());

            }
            if (object instanceof Dog) {
                System.out.println(((Dog) object).getName());

            }

        }

//        for (int i = 0; i < mixedList.size(); i++) {
//            Object object = mixedList.get(i);
//
//            Class objectClass = mixedList.get(i).getClass();
////            objectClass.cast(mixedList.get(i));
//            System.out.println((objectClass.getName()) object);
//            
////            System.out.println(objectClass.asSubclass(NameStrategy).getName());
////            System.out.println(object.getClass().getName());
//        
//        }

        for (int i = 0; i < mixedList.size(); i++) {
            NameStrategy name = (NameStrategy) mixedList.get(i);
            System.out.println(name.getName());

        }

    }
}
