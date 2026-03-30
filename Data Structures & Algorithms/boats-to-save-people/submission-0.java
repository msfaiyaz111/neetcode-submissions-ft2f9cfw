class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        while(j>=i){
            if(people[i] + people[j] <=limit){
                count++;
                i++;
                j--;
            }
            else{
                count++;
                j--;
            }
        }
        return count;
    }
}