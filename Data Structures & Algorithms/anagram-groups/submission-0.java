class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int charCount[] = new int[26];
            char chars[] = strs[i].toLowerCase().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                charCount[chars[j] - 'a']++;
            }
            String key = Arrays.toString(charCount);
            res.putIfAbsent(key , new ArrayList<>());
            res.get(key).add(strs[i]);
        }
        return new ArrayList<>(res.values());
    }
}

