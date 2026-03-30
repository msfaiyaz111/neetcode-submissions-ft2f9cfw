class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> s = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            s.put(numbers[i], i);
            numbers[i] -= target;
        }
        for(int i=0; i<numbers.length; i++){
            if(s.containsKey(numbers[i]*-1) && s.get(numbers[i]*-1) != i){
                return new int[]{i+1, s.get(numbers[i]*-1)+1};
            }
        }
        return new int[]{0,0};

    }
}