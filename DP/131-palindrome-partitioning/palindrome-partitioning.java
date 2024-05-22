class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
       func(s,s.length(),0,ans,new ArrayList<>());
        return ans;
    }


    public void  func( String s,int n, int ind , List<List<String>> res, ArrayList<String> arr )
    { 
        if(ind>=n)
        {  res.add(new ArrayList<>(arr));
            return ;
        } 
       

         for(int i=ind;i<n;i++)
         {
             if(isPalin(s,ind, i))
             {
                 arr.add(s.substring(ind,i+1));
                 func(s,n,i+1,res,arr);
                 arr.remove(arr.size()-1);
             }
         }
    }



    public boolean isPalin(String st,int i,int j)
    {
        while(i<=j)
        {
            if(st.charAt(i)!=st.charAt(j))
             { return false;}
             i++;
             j--;
        }

        return true;
    }
}