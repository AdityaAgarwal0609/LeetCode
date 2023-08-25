import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
     int a=0;
     for(int i=s.length()-1;i>0;i--)   
     {
        if(s.charAt(i)!=' '&&s.charAt(i-1)==' ')
        {    
            a=i;
            break;

        }
       
     }
     String temp=s.substring(a).trim();
     return temp.length();
    }
}