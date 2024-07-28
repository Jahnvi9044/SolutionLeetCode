class Solution {
    public int nonSpecialCount(int l, int r) {
        // int[] isSpecial = new int[r-l+1];
        
        ArrayList<Long>  arr = new ArrayList<>();

        seive((int)Math.sqrt(r),arr);
           int count = 0;
        // System.out.println(arr);
        for(long i : arr)
        {   
           if(l<=(i*i) && r>=(i*i) )
             count++;
        }

  return r-l+1-count;

    }

    public void seive(int n,ArrayList<Long> arr )
    { 

        long [] primes =new long[n+1];
        primes[1] = 1L ;

        for(int i =2;i*i<=n;i++)
        {
            if(primes[i]==0L)
            {
                for(int  j = i*i ; j<=n ; j+=i)
                {
                    primes[j]=1L;
                }
            }
        }

        for(int  i = 1;i<n+1;i++)
        {
            if(primes[i]==0)
              arr.add((long)i);
        }


    }
}