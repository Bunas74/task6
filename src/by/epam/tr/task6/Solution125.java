package by.epam.tr.task6;

public class Solution125 {
    
    public static void main(String[] args) {
        
        	/* 125.	Шифр "Сэндвич".  Дан текст. Осуществить шифрование и дешифрование следующим образом:
            текст разбивается на две одинаковых по количеству символов части и результатом шифрования является строка,
            в которой символы из первой части чередуются символами из второй части. */
        	

         String str = "Simplicity is the ultimate sophistication.";
         
         pr("Start line is:");
         
         pr("\t\"" + str + "\"\n");
                
         
         String encryptedStr;
                
         String decryptedStr;
         
         
                 
         encryptedStr = encrypted(str);
         
         pr("Encrypted string is:");
         
         pr("\t\"" + encryptedStr + "\"\n");
           
         
         decryptedStr = decrypted(encryptedStr);
         
         pr("Decrypted string is:");
         
         pr("\t\"" + decryptedStr + "\"");
         
        
    }
    
    
    public static void pr(String str) {
        
        System.out.println(str);
        
    }
    
    public static String encrypted(String str) {
        
        
        int n;
         
        int m;
         
        char[] firstStr;
         
        char[] secondStr;
         
        String encryptedStr = "";
         
         
         
        if(str.length() / 2 == 0) {
             
            n = str.length() / 2;
             
            m = str.length() / 2;
             
        }
         
        else {
             
            n = str.length() / 2;
             
            m = str.length() / 2 + 1;
             
        }
         
        firstStr = new char[n];
         
        secondStr = new char[m];
         
         
        for(int i = 0; i < n; i++) {
             
            firstStr[i] = str.charAt(i);
             
        }
         
        for(int i = n, j = 0; i < str.length(); i++) {
             
            secondStr[j++] = str.charAt(i);
             
        }
         
         
        for(int i = 0; i < n; i++) {
             
            encryptedStr += "" + firstStr[i] + secondStr[i];
                            
        }
         
        if(n != m) {
             
            encryptedStr += secondStr[secondStr.length - 1];
             
        }
        
        return encryptedStr;
        
    }
    
    
    public static String decrypted(String str) {
        
        
        int n;
         
        int m;
         
        char[] firstStr;
         
        char[] secondStr;
         
        String decryptedStr = "";
        
        
        
        if(str.length() / 2 == 0) {
             
            n = str.length() / 2;
             
            m = str.length() / 2;
             
        }
         
        else {
             
            n = str.length() / 2;
             
            m = str.length() / 2 + 1;
             
        }
         
        firstStr = new char[n];
         
        secondStr = new char[m];
        
        
        int k = 0; 
        
        int l = 0;
        
        if(str.length() / 2 == 0) {
              
            for(int i = 0; i < str.length(); i++) {
                
               if(i % 2 == 0) {
                   
                   firstStr[k++] = str.charAt(i);
                   
               }
               
               else {
                   
                   secondStr[l++] = str.charAt(i);
                   
               }
            
            }
            
        }
        
        else {
            
            for(int i = 0; i < str.length() - 1; i++) {
                
               if(i % 2 == 0) {
                   
                   firstStr[k++] = str.charAt(i);
                   
               }
               
               else {
                   
                   secondStr[l++] = str.charAt(i);
                   
               }
            
            }
           
           secondStr[secondStr.length - 1] = str.charAt(str.length() - 1);
            
        }
        
        String str1 = new String(firstStr);
        
        String str2 = new String(secondStr);
        
        decryptedStr = str1 + str2;
        
        return decryptedStr;
        
    }
    
}
