package afi;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SecondDuplicate {
    public static Map secondDuplicate(String input){
        int first=0;
        int second=0;
        String secondDup=null;
        boolean secondflag=false;
        boolean firstflag=true;
        Map <String,Integer> secondDupMap=new HashMap<String,Integer>();
        Map <String,Integer> dupMap=new HashMap<String,Integer>();
        for(int i=0;i<input.length();i++){
            
            Integer temp=dupMap.get(""+input.charAt(i));
           int count=  (temp == null) ? 0 : temp;
           
            dupMap.put(""+input.charAt(i), ++count);
            
            if (count >2 &&  firstflag  && !secondflag ){
                secondflag=true;
                firstflag=false;
            }
            if(secondflag){
                secondDup=""+input.charAt(i);
            }
            
          }
          
         secondDupMap.put(secondDup,dupMap.get(secondDup)); 
         return secondDupMap;
    }
    
    
    public static Map secondDuplicateWithArrayList(String input){
        int first=0;
        int second=0;
        String secondDup=null;
        boolean secondflag=false;
        boolean firstflag=true;
        Map <String,Integer> secondDupMap=new HashMap<String,Integer>();
        Map <String,Integer> dupMap=new HashMap<String,Integer>();
        for(int i=0;i<input.length();i++){
            
            Integer temp=dupMap.get(""+input.charAt(i));
           int count=  (temp == null) ? 0 : temp;
           
            dupMap.put(""+input.charAt(i), ++count);
            
            if (count >2 &&  firstflag  && !secondflag ){
                secondflag=true;
                firstflag=false;
            }
            if(secondflag){
                secondDup=""+input.charAt(i);
            }
            
          }
          
         secondDupMap.put(secondDup,dupMap.get(secondDup)); 
         return secondDupMap;
    }
    
    
}


