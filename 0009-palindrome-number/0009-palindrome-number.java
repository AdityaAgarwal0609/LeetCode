class Solution {
    public boolean isPalindrome(int x) {
         int n = x;
         int r = 0,sum=0;
        while(n>0)
        {
          r = n%10;
          sum = sum*10+r;
          n=n/10;

        }
        if(sum==x)
        return(true);
        else
        return(false); 
    }       
}