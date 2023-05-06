class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length; i++){
            int required_target = target - nums[i];
            if(map.containsKey(required_target)){
                return new int[] {i, map.get(required_target)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}