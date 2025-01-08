class Solution {
    public int countPrefixSuffixPairs(String[] words) {
     int n=words.length;
           int count=0;
           for(int i=0;i<n;i++)
           {
               for(int j=i+1;j<n;j++)
               {
                   if(prefixSuffix(words[i],words[j]))
                   {
                       count++;
                   }
               }
           }

            // System.out.println(count);
        return count;

        

    }


    public static boolean prefixSuffix(String a, String b)
    {
        if(b.startsWith(a) && b.endsWith(a))
            return true;
        else return false;

    }
}
