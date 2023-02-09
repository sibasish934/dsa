public class Solution {
    public static int makeBeautiful(String str) {
       if(str.length()== 0||str.length() == 1){
           return 0;
       }

       int t1=0;
       int t2 =0;
       char s1 = '0';
       char s2= '1';

       for (int i=0; i<str.length(); i++){
           if(str.charAt(i) == '1'){
               if(s1 == '0'){
                   t1++;
               }else{
                   t2++;
               }
           }else{
               if(s1 == '1'){
                   t1++;
               }else{
                   t2++;
               }
           }

           if( s1 == '0'){
               s1='1';
               s2='0';
           }else{
               s1='0';
               s2='1';
           }
       }
       return Math.min(t1, t2);
    }
}
