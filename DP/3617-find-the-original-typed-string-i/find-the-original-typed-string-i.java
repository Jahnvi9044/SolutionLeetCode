class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;
        int count = 1 ; 
        word = word+" ";
        for( int i = 0 ; i<word.length()-1 ; i++ )
        {
            if(word.charAt(i)!=word.charAt(i+1))
            {  
                 ans += count - 1 ; 
                 count  = 1;
            }
            else count++;    
        } 
            return ans;
    }
}