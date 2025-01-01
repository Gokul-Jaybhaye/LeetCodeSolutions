package in.leetcodetwosum;

public class TwoSum1 {
		
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int n=nums.length;
        int x=target;
        int number=0;
       int result[]=new int[2];
        for(int i=0;i<n;i++){
            number=nums[i];
           for(int j=i+1;j<n;j++){
            sum=number+nums[j];
            if(x==sum){
                result[0]=i;
                result[1]=j;
            }
           }
         
        }
          return  result;
    }
}
