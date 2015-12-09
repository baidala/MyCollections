/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.itstep.android11.baidala;

import java.util.HashMap;

/**
 *
 * @author student
 */
public class MyCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String, User> usersMap = new HashMap<String, User>();
       User user1 = new User("John", "22.jpg", "qwert");
       User user2 = new User("John2", "22.jpg", "qwert");
       User user3 = new User("John3", "22.jpg", "qwert");
       
       usersMap.put("first", user1);
       usersMap.put("second", user2);
       usersMap.put("third", user3);
       User userFromMap = usersMap.get("first");
       
       System.out.println("we read user: name = "+userFromMap.name+" image = "+userFromMap.image);
       
       userFromMap = usersMap.get("second");
       System.out.println("we read user: name = "+userFromMap.name+" image = "+userFromMap.image);
        
       
       usersMap.put("new", new User("Oleg","34.jpg","pwd"));
       usersMap.remove("first");
        
    }
    
}
