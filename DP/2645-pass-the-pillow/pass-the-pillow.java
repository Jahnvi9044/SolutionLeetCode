class Solution {
    public int passThePillow(int n, int time) {
          
          int person = 1 ;

    

        //   st.push(1);   time = 10
        //  1->2->3->4    p = 3 , time = i = 10
          for(int i = 0 ; i<time ;)
          {    
               while(person<n && i<time )
               { if(time-i>n-1)
                {
                person+=(n-1);
                i+=(n-1);
                continue;
                } 
                person++;
                 i++;
               }
               while(person>1 && i<time)
               { 
                if(time-i>n-1)
                {
                    person-=(n-1);
                    i+=(n-1);
                    continue;
                }
                person--;
                i++;
               }
          } 
          return person;


    }
}