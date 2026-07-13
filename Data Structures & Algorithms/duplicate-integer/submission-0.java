
class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i <= nums.length-1 ; i++ ){
            if(set.add(nums[i]) == false){
                return true;
            }
            
        }
        return false; 

    }
}