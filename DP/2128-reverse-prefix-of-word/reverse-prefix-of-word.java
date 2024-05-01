class Solution {
    public String reversePrefix(String word, char ch) {
        String st ="";
        int first = word.indexOf(ch);

        for( int i = 0 ; i < word.length() ; i++ )
        {
            if(i <= first)
            { 
                st = word.charAt(i) + st ;
            }

            else st = st + word.charAt(i) ;
        }
    
       return st; 
    }
    
}