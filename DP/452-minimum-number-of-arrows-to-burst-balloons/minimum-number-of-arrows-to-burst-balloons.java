class Solution {

    public int findMinArrowShots(int[][] points) {
            
             int n=points.length;
             Pair[]  pairs =new Pair[n];
            for( int i=0 ; i<n ; i++ )
            {   
                pairs[i]=new Pair(points[i][0],points[i][1]);
               

            }

            Comparator<Pair> ob = (o1,o2)->
                
                 ( (o1.e>o2.e)?1:-1)
            ;
            Arrays.sort(pairs,ob);


            
            for(Pair p : pairs)
            System.out.println(p.print());



                int count=0;
                int start =pairs[0].s;
                int end =pairs[0].e;
                count++;
             for(int i=1 ; i<n ; i++)
             {
                  
                     if(pairs[i].s>start && pairs[i].s>end)
                       {  start=pairs[i].s;
                          end = pairs[i].e; 
                        count++;
                       }


             }

            //  System.out.println(count);

   return count;
    }
}


class Pair
{
    int s;
    int e;
    Pair(int s, int e)
    {   
         this.s=s;
         this.e=e;
    }

    public String print()
    {
       return this.s+" "+this.e;
    }
}

