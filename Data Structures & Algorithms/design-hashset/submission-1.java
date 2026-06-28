class MyHashSet {
    boolean[] falseArray = new boolean[1000001];//since 0 <= key <= 1,000,000 (using boolean array)
    public MyHashSet() {
    }
    
    public void add(int key) {
        falseArray[key] = true;
        }
    
    
    public void remove(int key) {
        falseArray[key] = false;   
    }
    
    public boolean contains(int key) {
        return falseArray[key];
    }    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */