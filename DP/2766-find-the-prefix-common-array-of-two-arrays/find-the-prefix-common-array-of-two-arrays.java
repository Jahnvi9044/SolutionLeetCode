class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 ;


        int[] arr = new int[A.length];

        for(int i = 0;i<A.length;i++)
        {
          set1.add(A[i]);
          set2.add(B[i]);
           set3 = new HashSet<>(set1);   
      
           set3.retainAll(set2);
           arr[i] = set3.size() ; 
        }
       

           return  arr;        
    }
}