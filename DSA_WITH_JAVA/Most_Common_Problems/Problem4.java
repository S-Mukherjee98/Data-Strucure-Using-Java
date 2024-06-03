package DSA_WITH_JAVA.Most_Common_Problems;

import java.util.LinkedHashMap;
import java.util.Map;


//Find the first non-repeating character in a string. 


public class Problem4 {
    public static char getCharacter(String str){

        String lower_str=str.toLowerCase();
        Map<Character,Integer> charMap=new LinkedHashMap<>();
        for (char ch : lower_str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character,Integer> entry : charMap.entrySet()) {
            if (entry.getValue()==1) {
                return  entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str="GeeksForGeeks";
       char res=getCharacter(str);
       if (res!='\0') {
        System.out.println("First Non-repeating character is "+res);
       }
       else{
        System.out.println("Not found");
       }

    }
}
