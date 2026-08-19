class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int right = numbers.length - 1;
        int left = 0;
        while((numbers[right] + numbers[left]) != target){
            if((numbers[right] + numbers[left]) > target){
                right-=1;
            }
            else if((numbers[right] + numbers[left]) < target){
                left+=1;
            }
        }
        return new int[] { left+1, right+1 };
    }
}
