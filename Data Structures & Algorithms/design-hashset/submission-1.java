class MyHashSet {
    int[] arr = new int[100];
    int length = 0;
    public MyHashSet() {
        for(int i=0; i<100; i++){
            arr[i] = -1;
        }
    }
    
    public void add(int key) {
        if(contains(key)){
            return;
        }
        arr[length] = key;
        length++;
        if(arr.length == length){
            int[] temp = new int[arr.length*2];
            for(int i = 0; i<arr.length; i++){
                temp[i] = arr[i];
            }
            for(int i=arr.length; i<temp.length; i++){
                temp[i] = -1;
            }
            arr = temp;
        }
    }
    
    public void remove(int key) {
        if(!contains(key)){
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                if(i == arr.length-1){
                    arr[i] = -1;
                    length--;
                    break;
                }
                for(int j=i, k=i+1; k<arr.length; j++, k++){
                    arr[j]=arr[k];
                    if(arr[j]==-1){
                        break;
                    }
                    if(k==arr.length-1){
                        arr[k] = -1;
                    }
                }
                length--;
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i=0; i<arr.length;i++){
            if(arr[i] == key){
                return true;
            }
            if(arr[i] == -1){
                return false;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */