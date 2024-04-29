class Solution {
    public int minOperations(int[] nums, int k) {
        
            int xor=0;
        for( int i=0 ; i<nums.length ; i++ )
        {  
            xor^=nums[i];
        }
        
        int count=0;
        System.out.println(k+" "+xor);
        for(int i=0;i<32;i++)
        {  
            if( ( k&(1<<i) )!=0)
            { 
                
                 if(!(( xor&(1<<i))!=0 ))
                    count++;   
            }
            
            
            else 
            {
                if( (xor&(1<<i))!=0 )
                    count++;
            }
                
        }
        
        
        return count;
        
        
        
    }
}