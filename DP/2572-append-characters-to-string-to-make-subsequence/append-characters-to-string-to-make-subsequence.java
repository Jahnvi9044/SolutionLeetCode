class Solution {
    public int appendCharacters(String s, String t) {


        // coaching 
        //        i 
        // coding 
        //   j

       int i=0,j=0;
       while(i<s.length() && j<t.length())
    {   
        
        
        if( s.charAt(i)==t.charAt(j))
        {
            i++;
            j++;
        }
        else if(s.charAt(i)!=t.charAt(j) )
        {
              i++;
        } 

        

    }

          return t.length()-j;

 }
}