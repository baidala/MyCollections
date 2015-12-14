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
public class MyCursor {
    private String[] myKeys;
    
    MyCursor ( String[] keys  ) {
        this.setKeys(keys);
    }
    
    void setKeys(String[] keys) {
        myKeys = keys;
    }
    
    
    String[] getKeys() {
        return this.myKeys;
    }
    
    
    public void printItems(HashMap<String, String> h, String[] keys) {
        System.out.println("id:"+h.get("id")+"\n"  +"job:"+h.get("job")+"\n"  +"name:"+h.get("name"));
        System.out.println("");
        System.out.println("Row:");
        for (int i = 0; i < keys.length;i++) {
            System.out.println(keys[i]+": "+h.get(keys[i]));
        }
    
    }
    
    
}
