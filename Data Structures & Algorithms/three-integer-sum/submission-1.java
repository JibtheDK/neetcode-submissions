class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            int k = nums.length - 1;
            int j = i+1;
            int target = -(nums[i]);
            
            while( j<k ){
                if((nums[k] + nums[j]) == target){
                    List<Integer> zeroSum = List.of(nums[i], nums[j], nums[k]);
                    if(nums[i] + nums[j] + nums[k] == 0 && j!=k){
                        boolean t = true;
                        for(List<Integer> arr : finalList){
                            if(arr.equals(zeroSum)){
                                t = false;
                                break;
                            }
                        }
                        if(t == true){
                            finalList.add(zeroSum);
                        }
                    }
                    j++;
                    k--;
                }

                else if((nums[k] + nums[j]) > target){
                    k-=1;
                }

                else if((nums[k] + nums[j]) < target){
                    j+=1;
                }
            }
            
            
            /*if(nums[i] + nums[j] + nums[k] == 0 && j!=k){
                boolean t = true;
                for(List<Integer> arr : finalList){
                    if(arr.equals(zeroSum)){
                        t = false;
                        break;
                    }
                }
                if(t == true){
                    
                    finalList.add(zeroSum);
                }
                
            }*/



        }
        return finalList;

    }
}
