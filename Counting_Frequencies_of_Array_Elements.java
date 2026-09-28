class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            List<Integer> l = new ArrayList<>();
            l.add(entry.getKey());
            l.add(entry.getValue());
            ans.add(l);
        }

        return ans;
    }
}
