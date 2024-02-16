class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

       HashMap<Integer,Integer> map=new HashMap<>();
       for(int a:arr) map.put(a,map.getOrDefault(a,0)+1);
       
      

        ArrayList<Integer> arr1=new ArrayList<>(map.values());
        Collections.sort(arr1);
      int count=0;
        for(int i=0;i<map.size();i++)
       {
         int bb= arr1.get(i);

         if(bb<=k)
        {   
            count++;
            k=k-bb;
           
        }
         
         else {
             int c=bb-k;
             k=0;
         }

           if(k==0)
             break;
       }
       return arr1.size()-count;
   
    }
}


// class Pair
// {
//    Integer a;
//    Integer b;

//    Pair(Integer a,Integer b)
//    {
//        this.a=a;
//        this.b=b;

//    }

  
// }