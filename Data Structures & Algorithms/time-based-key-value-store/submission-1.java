class TimeMap {
    HashMap <String, HashMap<Integer, String>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            HashMap<Integer, String> t = new HashMap<>();
            t.put(timestamp, value);
            hm.put(key, t);
        }else{
            HashMap<Integer, String> t = hm.get(key);
            t.put(timestamp, value);
            hm.put(key, t);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)) return "";
        HashMap<Integer, String> t = hm.get(key);
        while(timestamp >0){
            if(t.containsKey(timestamp)) return t.get(timestamp);
            else timestamp--;
        }
        return "";
    }
}
