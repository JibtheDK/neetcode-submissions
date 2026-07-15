// o(n+m) time and o(1) space aim

class Solution {
    public boolean isAnagram(String s, String t) {

        List<Character> aS = new ArrayList<>();
        for (char c : s.toCharArray()) {
            aS.add(c); 
        }
        aS.sort(null); 
        HashMap<Character, Integer> hm1 = new HashMap<>();

        List<Character> aS2 = new ArrayList<>();
        for (char c : t.toCharArray()) {
            aS2.add(c); 
        }
        aS2.sort(null); 
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i = 0; i <= aS.size() - 1; i++){

            hm1.put(aS.get(i) , i+1);

            
        }
        for(int j = 0; j <= aS2.size() - 1; j++){
            hm2.put(aS2.get(j) ,j+1);


        }

        return hm1.equals(hm2);

    }
}
