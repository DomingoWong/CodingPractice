class Solution {
	
    /*
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        if (strs[0].equals("")) {
            return "";
        }
        String prefix = strs[0].substring(0,1);
        int addIndex = 1;
        
        while(addIndex < strs[0].length()) {
            int index = strs[0].indexOf(prefix);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].equals("")) {
                    return "";
                }
                if (index != strs[i].indexOf(prefix)) {
                    return prefix.substring(0, prefix.length() - 1);
                }
            }
            prefix += strs[0].charAt(addIndex);
            addIndex++;
        }
        return strs[0]; 
    }
    */
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0) return "";
    	String prefix = strs[0];
    	for (int i = 1; i < strs.length; i++) {
    		while (strs[i].indexOf(prefix) != 0) {
    			prefix = prefix.substring(0, prefix.length() - 1);
    			if (prefix.isEmpty()) return "";
    		}
        }
        return prefix;
    }
}