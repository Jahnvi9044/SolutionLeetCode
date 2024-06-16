class Solution {
 
   private class Projects{
    int p;
    int c;
    Projects(int p , int c )
    {
        this.p = p;
        this.c = c;
    }

    // String print(){
    //     return this.p+":"+this.c+" ";
    // }
   } 


   public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

              PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y)->(y-x));
              int n = profits.length;
              Projects[] projects = new Projects[n];
              
              for(int i = 0;i<n;i++)
              {
                 projects[i] = new Projects(profits[i],capital[i]);
              }  

        Arrays.sort(projects,(o1,o2)->o1.c-o2.c);
 
    //   for(int i = 0;i<n;i++)
        // System.out.print(projects[i].print()+",");

          int i = 0;
       for(int j = 0;j<k;j++)
       {  

        while(i<n && projects[i].c<=w)
        {
            maxHeap.add(projects[i].p);
            i++;
        }
        if(maxHeap.isEmpty())
          break;

        else
        {
            w += maxHeap.poll();
        }  
       }
       return w;
    }
}