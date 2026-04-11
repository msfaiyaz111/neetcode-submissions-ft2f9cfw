class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) p.add(i);
        while(p.size() > 1){
            int x = p.remove();
            int y = p.remove();
            if(x != y){
                p.add(Math.abs(x-y));
            }
        }
        if(p.size() == 0) return 0;
        return p.peek();

    }
}
