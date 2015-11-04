/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author MCENDROWSKI
 */
public class SetExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Radwanska", "Agnieszka", "123456789"));
        employeeList.add(new Employee("Kvitova", "Petra", "234567890"));
        employeeList.add(new Employee("Williams", "Serena", "345678901"));
        employeeList.add(new Employee("Williams", "Serena", "345678901"));
         employeeList.add(new Employee("Radwanska", "Agnieszka", "999999999"));

        for(Employee employee: employeeList){
            System.out.println(employee.toString());
        }
        
        
        
        Set<Employee>set = new HashSet<>(employeeList);
        
//        employeeList=null;
        
        employeeList = new ArrayList<>(set); 
        set=null;
        
        
        
        System.out.println("--------------------------- list --------------------------------------");
        for(Employee emp: employeeList){
            System.out.println(emp.toString());
        }
       
    }

}
