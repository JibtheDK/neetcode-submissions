class Solution {

    public String encode(List<String> strs) {
        String code = "";
        for(String str : strs){
            int len = str.length();
            code += len;
            code += '#'; 
            code += str;
        }
        return code;
    }

    public List<String> decode(String str) { 
        List<String> strs = new ArrayList<>();
        int i = 0;
        String len = "";
        while (i < str.length()) {

            if(str.substring(i,i+1).equals("#")){

                int j = Integer.parseInt(len); 
                strs.add(str.substring(i+1, i+j+1));
                i += j;
                i += 1;
                len = "";
                
            }
            else{
                len += str.substring(i,i+1);
                i++;
            }

        }
        return strs;
    }

}
