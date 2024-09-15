class Solution(object):
    def isPalindrome(self, x):

        """
        :type x: int
        :rtype: bool
        """
        if(x < 0):
          return False
        i=x 
        ref = 0
        while(i!=0):  
            d = i%10;
            ref = ref *10+d;
            i=i//10;
            print(i)

        return x==ref
        