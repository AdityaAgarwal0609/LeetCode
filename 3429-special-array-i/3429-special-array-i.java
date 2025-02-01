class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n= nums.length;
        int c=0;
        if(n==1)
        {
         return true; 
        }

        for(int i=1;i<n;i++)
        {
          if((nums[i-1]+nums[i])%2==0)
          {
            c=1;
            break;
          }

        } 
        if(c==0)
        return true ;
        else 
        return false; 
    }
}