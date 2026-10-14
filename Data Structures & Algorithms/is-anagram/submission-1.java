class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        if(t.length() != s.length()) return false;
        for(int i = 0; i < t.length(); i++){
            chars[s.charAt(i) - 'a'] = chars[s.charAt(i) - 'a'] + 1;
            chars[t.charAt(i) - 'a'] = chars[t.charAt(i) - 'a'] - 1;
        }
        for(int j = 0; j < chars.length; j++) {
            if(chars[j] != 0) return false;
        }
        return true;
    }
}
