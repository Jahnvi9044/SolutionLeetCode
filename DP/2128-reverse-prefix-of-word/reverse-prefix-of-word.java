class Solution {

    public String reversePrefix( String word , char ch ) {
        StringBuffer st =new StringBuffer("");
        int first = word.indexOf(ch);
        if(first==-1)
          return word;


        for( int i = 0 ; i <= first ; i++ )
        {
 
                st.insert( 0 , word.charAt(i) +"") ;

        }

               if(first!=-1)
                 st.append(word.substring(first+1,word.length()));
               
       return st.toString(); 
    }
    
}