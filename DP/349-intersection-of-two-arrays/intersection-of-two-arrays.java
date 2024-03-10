class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {




        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();


        for( int i:nums1)
          s1.add(i);
        for(int j:nums2 )
          s2.add(j);

        s1.retainAll(s2);
        int i=0;
        int n=s1.size();
    int [] ans1=new int[n];
       Iterator it =s1.iterator();

       while(it.hasNext())
       {
       
        ans1[i]=(Integer)it.next();
         i++;

       }

       return ans1;

    }
}
