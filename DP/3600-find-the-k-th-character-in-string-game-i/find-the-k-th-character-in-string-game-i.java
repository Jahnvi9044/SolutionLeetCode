class Solution {
    public char kthCharacter(int k) {
        String word="a";
        
        for(int i = k ; i>0 ; i/=2)
         {
            String word_new = fun(word);
            word = word + word_new;     
          
         }
         return word.charAt(k-1);
    }

    public String fun(String word)
    {    String ans ="";
        for( char ch :word.toCharArray())
        {   if(ch=='z')
              ch='a';
            else   
              ch=(char)(ch+1);
            ans+=ch;
        }  
        return ans ;  
    }
}