class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        

      Arrays.sort(tokens);
      int max=0,score=0;

      int i=0,j=tokens.length-1;
      while(i<=j)
      {    
          if(tokens[i]<=power)
          {
              
              power=power-tokens[i];
              i++;
              score++;
          }
          
           else 
           {   if(score>0)
               {
                 
                 power=power+tokens[j];
                 j--;
                 score--;
               }
               else break;
           }  

           
          max=Math.max(score,max);
      }
      
      max=Math.max(score,max);
      
      return max;
    }
}