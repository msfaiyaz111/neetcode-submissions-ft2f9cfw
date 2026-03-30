class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<int[], List<String>> ht = new Hashtable<>();
            for(int i =0; i<strs.length; i++){
                int[] c = alphabetCount(strs[i]);
                List<String> temp = new ArrayList<>();




                if(containsKey(ht, c)){
                    System.out.println("here1");
                    temp = manualGet(ht,c);
                    ht = manualRemove(ht, c);
                    temp.add(strs[i]);
                    ht= manualPut(ht, c, temp);
                }else{
                    System.out.println("here2");
                    temp.add(strs[i]);
                    ht= manualPut(ht, c, temp);
                }
            }
            for(int[] t :ht.keySet()){
                System.out.println(ht.get(t).size());
            }

        System.out.println(ht.keySet());
            List<List<String>> sol = new ArrayList<>();
            for(int[] t : ht.keySet()){
                sol.add(ht.get(t));
            }
            return sol;


    }
    boolean containsKey(Hashtable<int[], List<String>> ht, int[] arr){
        for(int[] k : ht.keySet()){
            if(checkArrayEquality(k, arr)){
                return true;
            }
        }
        return false;
    }
    List<String> manualGet(Hashtable<int[], List<String>> ht, int[] key) {
        for (int[] k : ht.keySet()) {
            if (checkArrayEquality(k, key)) {
                return ht.get(k); // use the REAL stored key
            }
        }
        return null;
    }
    Hashtable<int[], List<String>> manualPut(Hashtable<int[], List<String>> ht, int[] key, List<String> value) {
        for (int[] k : ht.keySet()) {
            if (checkArrayEquality(k, key)) {
                ht.put(k, value); // overwrite existing key
                return ht;
            }
        }
        ht.put(key, value); // new key
        return ht;
    }
    Hashtable<int[], List<String>> manualRemove(Hashtable<int[], List<String>> ht, int[] key) {
        int[] toRemove = null;

        for (int[] k : ht.keySet()) {
            if (checkArrayEquality(k, key)) {
                toRemove = k;
                break;
            }
        }

        if (toRemove != null) {
            ht.remove(toRemove);
        }
        return ht;
    }


    boolean checkArrayEquality(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }


    int[] alphabetCount(String str){
        char[] c = str.toCharArray();
        int[] count = new int[26];
        for(int i=0; i<count.length; i++){
            count[i] = 0;
        }
        for(int i=0; i< c.length; i++){
            if(c[i] == 'a'){
                count[0]++;
            }
            else if(c[i]=='b'){
                count[1]++;
            }
            else if(c[i]=='c'){
                count[2]++;
            }
            else if(c[i]=='d'){
                count[3]++;
            }
            else if(c[i]=='e'){
                count[4]++;
            }
            else if(c[i]=='f'){
                count[5]++;
            }
            else if(c[i]=='g'){
                count[6]++;
            }
            else if(c[i]=='h'){
                count[7]++;
            }
            else if(c[i]=='i'){
                count[8]++;
            }
            else if(c[i]=='j'){
                count[9]++;
            }
            else if(c[i]=='k'){
                count[10]++;
            }
            else if(c[i]=='l'){
                count[11]++;
            }
            else if(c[i]=='m'){
                count[12]++;
            }
            else if(c[i]=='n'){
                count[13]++;
            }
            else if(c[i]=='o'){
                count[14]++;
            }
            else if(c[i]=='p'){
                count[15]++;
            }
            else if(c[i]=='q'){
                count[16]++;
            }
            else if(c[i]=='r'){
                count[17]++;
            }
            else if(c[i]=='s'){
                count[18]++;
            }
            else if(c[i]=='t'){
                count[19]++;
            }
            else if(c[i]=='u'){
                count[20]++;
            }
            else if(c[i]=='v'){
                count[21]++;
            }
            else if(c[i]=='w'){
                count[22]++;
            }
            else if(c[i]=='x'){
                count[23]++;
            }
            else if(c[i]=='y'){
                count[24]++;
            }
            else if(c[i]=='z'){
                count[25]++;
            }
        }
        return count;
    }
}