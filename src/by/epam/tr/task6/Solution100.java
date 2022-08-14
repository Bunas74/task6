package by.epam.tr.task6;

public class Solution100 {
    
    public static void main(String[] args) {
         	
         			/* 100.	В заданном предложении найти пару слов, из которых одно является обращением другого
                    (обращение – слово, получающееся из исходного записью его букв в обратном порядке). */
         			
         			
         			String str = "There is a ghost town in Nevada called Adaven";
         			
         			
         			String[] ar = str.split(" ");
         			
         			String str1 = "";
         			
         			String str2 = "";
         			
         			for(int i = 0; i < ar.length - 1; i++) {
         			    
         			    for(int j = 1; j < ar.length; j++) {
         			        
         			        if(ar[i].equalsIgnoreCase(reverse(ar[j]))) {
         			            
         			            str1 = ar[i];
         			            
         			            str2 = ar[j];
         			            
         			        }
         			        
         			    }
         			    
         			}
         			
         			
         			pr("In the line");
         			
         			pr("\t\"" + str + "\"\n");
         			
         			pr("are two mirror anagrams:");
         			
         			pr("\t" + str1 + " and " + str2);
        
    }
    
    
    
    public static void pr(String str) {
        
        System.out.println(str);
        
    }
    
    public static String reverse(String str) {
        
        String subStr = "";
        
        for(int i = str.length() - 1;i >= 0; i--) {
            
            subStr += str.charAt(i);
            
        }
        
        return subStr;
        
    }
    
}
