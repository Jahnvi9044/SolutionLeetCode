class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int  count = 0;
        for(String st : words)
        {
            if(st.startsWith(pref))
              count++;
        }

        return count ; 
    }
}