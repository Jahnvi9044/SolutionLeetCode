class Solution {
    public int appendCharacters(String s, String t) {


    int sl=s.length(),tl=t.length();
       int i=0,j=0;
       while(i<sl && j<tl)
    {   
        
        
        if( s.charAt(i)==t.charAt(j))
        {
            i++;
            j++;
        }
        else 
        {
              i++;
        } 

        

    }

          return tl-j;

 }
}