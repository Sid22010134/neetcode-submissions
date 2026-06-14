class MyHashSet {

    ArrayList<Integer> hashset = null;
    public MyHashSet() {
        hashset = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        boolean exists = false;
        for(int i: hashset){
            if(i == key){
                exists = true;
            }
        }

        if(!exists){
            hashset.add(key);
        }
    }
    
    public void remove(int key) {
        boolean exists = false;
        for(int i: hashset){
            if(i == key){
                exists = true;
            }
        }

        if(exists){
            hashset.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        boolean exists = false;
        for(int i: hashset){
            if(i == key){
                exists = true;
            }
        }

        if(exists){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */