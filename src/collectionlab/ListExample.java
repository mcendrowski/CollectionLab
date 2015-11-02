/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MCENDROWSKI
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List favoriteCities = new ArrayList();

        favoriteCities.add("Paris");
        favoriteCities.add("London");
        favoriteCities.add("New York");
        favoriteCities.add("Warsaw");

        favoriteCities.stream().forEach((favoriteCity) -> {
            String city = (String) favoriteCity;
            System.out.println(favoriteCity);
        });

        for (Object favoriteCity : favoriteCities) {
            String city = (String) favoriteCity;
            System.out.println(city);
        }

        for (Iterator it = favoriteCities.iterator(); it.hasNext();) {
            Object favoriteCity = it.next();
            String city = (String) favoriteCity;
            System.out.println(city);
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < favoriteCities.size(); i++) {
            String city = (String) favoriteCities.get(i);
            System.out.println(city);
        }

        favoriteCities.addAll(favoriteCities);

        System.out.println("----------------- after adding --------------------------------");
        for (int i = 0; i < favoriteCities.size(); i++) {
            String city = (String) favoriteCities.get(i);
            System.out.println(city);
        }

        favoriteCities.remove(1);
//        PredicateExample<String> filter;
//        filter = new PredicateExample<>();
//        filter.varc1 = "Warsaw";

//        favoriteCities.removeIf(filter);
        
         System.out.println("------------ after removal -------------------------------------");
        for (int i = 0; i < favoriteCities.size(); i++) {
            String city = (String) favoriteCities.get(i);
            System.out.println(city);
        }
    }

    class PredicateExample<t> implements Predicate<t> {

        t varc1;

        @Override
        public boolean test(t varc) {
            return varc1.equals(varc);
        }

    }

}
