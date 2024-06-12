class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
       func(s,ans,new ArrayList<>());
        return ans;
    }


    public void  func( String s, List<List<String>> res, ArrayList<String> arr )
    { 
        if(s=="")
        {  res.add(new ArrayList<>(arr));
            return ;
        } 
       
            int i = 0 ; 
         for(int j=0;j<s.length();j++)
         {
             if(isPalin(s.substring(i,j+1)))
             {
                 arr.add(s.substring(i,j+1));
                 func(s.substring(j+1),res,arr);
                 arr.remove(arr.size()-1);
             }
         }
    }



    public boolean isPalin(String st)
    {   
        int i = 0;
        int j = st.length()-1;
        while(i<j)
        {
            if(st.charAt(i)!=st.charAt(j))
             { return false;}
             i++;
             j--;
        }

        return true;
    }
}