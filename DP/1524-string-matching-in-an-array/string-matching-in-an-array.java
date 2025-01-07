class Solution {
    public List<String> stringMatching(String[] words) {
        int  n = words.length;
       List<String> ans =new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i!=j)
                {
                    if(words[j].contains(words[i])&& !ans.contains(words[i]))
                     {  
                        
                        ans.add(words[i]);
                     }
                }
            }
        }

        return ans ; 
    }
}

