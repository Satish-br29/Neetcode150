class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> list = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int freq[] = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            String key = Arrays.toString(freq);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        // for(Map.Entry<String, List<String>> entry : map.entrySet()) {
        //     List<String> demo = entry.getValue();
        //     list.add(demo);
        // }
        // return list;

        return new ArrayList<>(map.values());
    }
}
