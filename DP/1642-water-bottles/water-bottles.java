class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         
             
           int total = numBottles ;

         while( numBottles >= numExchange )
         {
              int d = numBottles/numExchange ; 
               // d= 9/3=3
               System.out.println(d);
               total+=d;

               int l = numBottles % numExchange;      
                //3
   
              int s = d + l ;

              numBottles = s ;   
    
         }

         return total;

     


         


    }
}