class RandomizedSet {
     // ArrayList<Integer> h ;
    HashMap<Integer,Integer> m ;
    ArrayList<Integer> l ; 
    public RandomizedSet() {
    // h = new ArrayList<>();
         m = new HashMap<>();
        l = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        // if(!h.contains(val)){
        //     h.add(val);
        //     return true;
        // }
        // else{
        //     return false;
        // }
        if(!m.containsKey(val)){
            l.add(val);
            m.put(val,l.size()-1);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean remove(int val) {
     // if(h.contains(val)){
     //        h.remove(Integer.valueOf(val));
     //        return true;
     //    }
     //    else{
     //        return false;
     //    }
        if(m.containsKey(val)){
        int a = m.get(val); // to get the index from map 
        Collections.swap(l,l.size()-1,a); // swap of element to last postion of list
        int b= l.get(a); // to get swaped value from list index 
        m.put(b,a); //put that value into map
        l.remove(l.size()-1);
        m.remove(val);
            return true;
        }
        else{
            return false;
        }
     
    }
    
    public int getRandom() {
    //     int max=h.get(0);
    //     for(int i=0;i<h.size();i++){
    //        if(h.get(i)>max){
    //            max= h.get(i);
    //        }
    //     }
    //     return max;
    // }
        Random random =new Random();
        int n = random.nextInt(l.size());
        return l.get(n);
    }  
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */