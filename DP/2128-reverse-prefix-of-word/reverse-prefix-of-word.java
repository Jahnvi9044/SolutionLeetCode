class Solution {
    public String reversePrefix(String word, char ch) {
        String st ="";
        int first = word.indexOf(ch);

        for( int i = 0 ; i <= first; i++ )
        {
 
                st = word.charAt(i) + st ;

        }

               if(first!=-1)
                 st = st + word.substring(first+1,word.length());
               else 
                 st=word;   
       return st; 
    }
    
}