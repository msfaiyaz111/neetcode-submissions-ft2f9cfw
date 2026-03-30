class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        car[] cars = new car[position.length];
        for(int i=0; i<position.length; i++){
            cars[i] = new car(position[i], speed[i]);
        }
        Arrays.sort(cars, Comparator.comparingInt((car c) -> c.pos).reversed());
    
    double[] time = new double[cars.length];
    for(int i=0; i<cars.length; i++){
        time[i] = (double)(target - cars[i].pos)/cars[i].speed;
    }
    Stack<Double> st = new Stack<>();
    st.push(time[0]);
    for(int i=1; i<time.length; i++){
        if(time[i] > st.peek()){
            st.push(time[i]);
        }
    }
    return st.size();
}
}
class car{
    int pos;
    int speed;
    public car(int pos, int speed){
        this.pos = pos;
        this.speed = speed;
    }
}