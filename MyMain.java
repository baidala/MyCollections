/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.itstep.android11.baidala;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author student
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<String, String> local = new HashMap<String, String>();
        
        local.put("id", "1");
        local.put("name", "Villiem");
        local.put("job", "farmer");
        local.put("age", "32");
        local.put("sex", "man");
        local.put("salary", "$60");
        
        String[] keys = {"id","name", "job", "age", "sex", "salary"};
        
        System.out.println("id:"+local.get("id")+"\n"+"job:"+local.get("job")+"\n"+"name:"+local.get("name"));
        
        printMap(local, keys);
        
        HashMap<String, String> local2 = new HashMap<String, String>();
        
        local2.put("id", "2");
        local2.put("name", "Scott");
        local2.put("job", "boss");
        local2.put("age", "32");
        local2.put("sex", "man");
        local2.put("salary", "$100");
        
        ArrayList<HashMap<String, String>>  employees = new ArrayList<HashMap<String, String>>();
        
        employees.add(local);
        employees.add(local2);
        
        printMap(employees.get(0), keys);
        
        printMap(employees.get(1), keys);
        
    }
    
    
    public static void printMap(HashMap<String, String> h, String[] keys) {
        System.out.println("id:"+h.get("id")+"\n"  +"job:"+h.get("job")+"\n"  +"name:"+h.get("name"));
        System.out.println("");
        System.out.println("Row:");
        for (int i = 0; i < keys.length;i++) {
            System.out.println(keys[i]+": "+h.get(keys[i]));
        }
    
    }
    
    
    static void printArray(ArrayList<String> array) {
        System.out.println("size = " + array.size());
        System.out.println("----------");
        for (int i = 0; i < array.size() ; i++) {
            System.out.println(array.get(i));
        }
        System.out.println("----------");
    }
    
    
    
    
}
