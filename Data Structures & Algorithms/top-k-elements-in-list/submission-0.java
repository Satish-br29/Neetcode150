class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        //create a array of list------initially it is just null like this -->> []
        List<Integer> bucket[] = new List[nums.length + 1];

        // Bucket: index = frequency & value = that num which has that much freq
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        // Fill answer from highest frequency
        int ans[] = new int[k];
        int idx = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null && idx < k) {
                for (int val : bucket[i]) {
                    ans[idx] = val;
                    idx++;

                    if (idx == k) {
                        break;
                    }
                }
            }
        }
        return ans;

    }
}