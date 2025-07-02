class Solution {
    public int possibleStringCount(String word) {
        // int ans = 1;
        int count = 0 ; 
        word = word+" ";
        for( int i = 0;i<word.length()-1 ; i++ )
        {
            if(word.charAt(i)==word.charAt(i+1))
                count++;  
        } 
            return count+1;
    }
}