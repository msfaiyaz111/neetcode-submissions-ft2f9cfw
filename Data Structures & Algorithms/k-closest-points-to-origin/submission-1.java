class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<Point> q = new PriorityQueue<Point>(
            (p1, p2) -> (p1.x*p1.x + p1.y*p1.y) - (p2.x*p2.x + p2.y*p2.y)  
        );
        for(int i=0; i<points.length; i++){
            Point p = new Point(points[i][0], points[i][1]);
            q.add(p);
        }
        int[][] temp = new int[k][2];
        for(int i=0; i<k; i++){
            Point p = q.poll();
            temp[i][0] = p.x;
            temp[i][1] = p.y;
        }
        return temp;
    }
}
class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}