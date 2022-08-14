package by.epam.tr.task6;

import java.util.*;

public class Solution131 {
    
    public static void main(String[] args) {

         	/* 131.	Дан массив названий переменных в camelCase. Преобразовать названия в snake_case. */
         	
         	
         String[]	ar = {"inputDoubleFromConsole", "UnsupportedEncodingException", "hasNextInt"};
         
         pr("CamelCase strings:\n");
         
         for(String elements: ar) {
             
             pr("\t\"" + elements + "\"");
             
         }
         
         pr("");
         
         
         pr("Snake_case strings:\n");
         
         
         for(String elements: ar) {
             
             pr("\t\"" + snake_case(elements) + "\"");
             
         }     	     		
        
    }
    
    
    public static void pr(String str) {
        
        System.out.println(str);
        
    }
    
    public static String snake_case(String str) {
        
        String newStr = "";
        
        List<Character> temp = new LinkedList<>();
        
        for(int i = 0; i < str.length(); i++) {
            
            temp.add(str.charAt(i));
            
        }
        
        for(int i = 0; i < temp.size(); i++) {
            
            if(temp.get(i) >= 65 && temp.get(i) <= 90) {
                
                temp.set(i, (char)(temp.get(i) + 32));
                
                temp.add(i, '_');
                
            }
            
        }
        
        for(int i = 0; i < temp.size(); i++) {
            
            newStr += temp.get(i);
            
        }
        
        return newStr;
        
    }
    
}