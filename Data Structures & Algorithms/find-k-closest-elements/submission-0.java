class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int t = Math.abs((x-a)) - Math.abs((x-b));
            if (t != 0) return t;
            else return a-b;
        });
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        List<Integer> sol = new ArrayList<>();
        for(int i=0; i<k; i++){
            sol.add(pq.poll());
        }
        Collections.sort(sol);
        return sol;

    }
}