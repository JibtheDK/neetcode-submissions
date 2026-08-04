class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> sortedNums = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(sortedNums.containsKey(nums[i])){
                sortedNums.put(nums[i], sortedNums.get(nums[i]) + 1);
            }
            else{
                sortedNums.put(nums[i], 1);
            }
        }

        List<Integer>[] bucketedList = new List[nums.length + 1];

        for(int i = 0; i < nums.length + 1; i++){
            bucketedList[i] = new ArrayList<>();
        }

        for (int key : sortedNums.keySet()) {
            bucketedList[sortedNums.get(key)].add(key);
        }

        List<Integer> result = new ArrayList<>();
        outer:
        for(int j = bucketedList.length - 1; j >= 0; j--){
            for(int num : bucketedList[j]){
                result.add(num);
                if (result.size() == k){
                    break outer;
                }
            }
        }
        //return result;
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
    
}
