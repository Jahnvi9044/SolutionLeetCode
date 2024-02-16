class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

       HashMap<Integer,Integer> map=new HashMap<>();
       for(int a:arr) map.put(a,map.getOrDefault(a,0)+1);
       
       Pair[] pair=new Pair[map.size()];
       
        int p=0;

       for( Map.Entry<Integer,Integer> e:map.entrySet())
       {
           int a=e.getKey();
           int b=e.getValue();
           pair[p]=new Pair(a,b);
           p++;
       }
        Comparator<Pair> obj=(o1,o2)->(o1.b).compareTo(o2.b);
       Arrays.sort(pair,obj);
      int count=0;
        for(int i=0;i<map.size();i++)
       {
           
      
       int bb= pair[i].b;

         if(bb<=k)
        {   
            count++;
            int c=k-bb;
            pair[i].b=-1;
            k=c;
        }
         
         else {
             int c=bb-k;
             k=0;
         }

           if(k==0)
             break;
       }

    //    for(int i=0;i<pair.length;i++)
    //    {  
    //        System.out.println(pair[i].print());
    //    }
      
       return pair.length-count;
   
    }
}


class Pair
{
   Integer a;
   Integer b;

   Pair(Integer a,Integer b)
   {
       this.a=a;
       this.b=b;

   }

   public String print()
   {
       return this.a+" "+this.b;
   }
}