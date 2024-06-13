class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
         
    //  Arrays.sort(seats);
    //  Arrays.sort(students);

      int[] freq = new int[101];
     

      for(int  i : seats)
      {
        freq[i]++;
      }
     int k =0 ;
      for(int i = 0 ; i <101 ; i++)
      {
        while(freq[i]>0)
        { 
            seats[k]=i;
            freq[i]--;
            k++;
        }
      } 

       for(int  i : students)
      {
        freq[i]++;
      }
      k =0 ;
      for(int i = 0 ; i <101 ; i++)
      {
        while(freq[i]>0)
        { 
            students[k]=i;
            freq[i]--;
            k++;
        }
      } 
      int  n =seats.length;
      int count = 0;
     for(int i =0 ;i<n;i++)
     {  
        count += Math.abs(seats[i]-students[i]); 

     }

     return count ; 

    }
}