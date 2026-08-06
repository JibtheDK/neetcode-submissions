class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        List<Integer> prefix = new ArrayList<>();
        List<Integer> suffix = new ArrayList<>();
        int[] output = new int[nums.length];
        int value = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                prefix.add(1);
            }
            else{
                prefix.add(prefix.get(prefix.size() - 1) * nums[i-1]);
            }
        }   
        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1){
                suffix.add(1);
            }
            else{

                suffix.add(suffix.get(suffix.size() - 1) * nums[i+1]);

            }
            
        }   

        for(int i = 0; i < output.length; i++){
            output[i] = prefix.get(i) * suffix.get(suffix.size() - i - 1);
        }
        return output;
    }
}  
