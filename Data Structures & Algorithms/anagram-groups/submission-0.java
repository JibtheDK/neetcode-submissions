class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> freqs = new HashMap<>();

        
        for(String str: strs){ 
            int[] key = new int[26];
            for(int i = 0; i < str.length(); i++){
                
                key[str.charAt(i) - 'a'] += 1; 

            }
            String signature = Arrays.toString(key);
            if(!freqs.containsKey(signature)){
                List<String> L = new ArrayList<>();
                L.add(str);
                freqs.put(signature, L);
            }
            else{
                freqs.get(signature).add(str);
            }

        }
        List<List<String>> list = new ArrayList<>(freqs.values());
        return list;
    }
}
