/* Noah Park

Given the array of integers nums, you will choose two different indices i and j of that array. 

Return the maximum value of (nums[i]-1)*(nums[j]-1)

*/

class Solution {
    public int maxProduct(int[] nums) {
        int first = 0, second = 0;
        
        for(int num : nums){
            if(num >= first){
                second = Math.max(second, first);
                first = num;
            }
            else if(num >= second) second = num;
        }
        
        return (first - 1) * (second - 1);
    }
}
