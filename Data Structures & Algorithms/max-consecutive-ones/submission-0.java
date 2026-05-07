class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int counter= 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 1){
                counter +=1;
                sum = Math.max(sum, counter);
            }else{
                counter = 0;
            }
        }
        return sum;
    }
}