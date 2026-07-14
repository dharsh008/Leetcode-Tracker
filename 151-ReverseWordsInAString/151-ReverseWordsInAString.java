// Last updated: 14/07/2026, 14:11:12
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String rev="";
       String wrds[]=s.split("\\s+");
       for(int i=wrds.length-1;i>=0;i--){
         rev= rev + wrds[i];
         if(i!=0){
            rev=rev + " ";
         }
       } 
       return rev;
    }
}