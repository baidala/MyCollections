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
    
    public HashMap<String, String> createItem(String[] keys, String[] values) {
    	HashMap<String, String> local = new HashMap<String, String>();
    	for (int i = 0; i < keys.length; i++) {
    		local.put(keys[i], values[i]);
    	}
    	
    	return local;
    }
    
    public HashMap<String, String> getItem(String key, String value){ 
    	HashMap<String, String> local = new HashMap<String, String>();
    	local.put(key, value);
    	
    	return local;
    }
    
    public getList (String[] keys, int lenght) {
    	ArrayList<> arrayList = new ArrayList<>();
    	for (int i = 0; i < lenght; i++) {
    		getItem(keys[i], );
    	}
    	
    	
    	return arrayList (вызывает getItem lenght-раз и создает ArrayList)
    }
    
    
    
    
}
