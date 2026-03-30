class MyHashMap {
    List<object> l = new ArrayList<object>();
    public MyHashMap() {
      List<object> l = new ArrayList<object>();  
    }
    
    public void put(int key, int value) {
        object temp = new object(key, value);
        for(int i=0; i<l.size(); i++){
            if(l.get(i).key == key){
                l.remove(i);
                break;
            }
        }
        l.add(temp);
    }
    
    public int get(int key) {
        for(int i = 0; i<l.size(); i++){
            if(l.get(i).key == key){
                return l.get(i).value;
            }
        }
        return -1; 
    }
    
    public void remove(int key) {
        for(int i=0; i<l.size(); i++){
            if(l.get(i).key == key){
                l.remove(i);
                break;
            }
        }
    }
}
class object{
    int key;
    int value;
    public object(int key, int value){
        this.key = key;
        this.value = value;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */