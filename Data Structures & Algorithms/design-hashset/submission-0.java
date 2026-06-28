class MyHashSet {
    LinkedList<Integer> Set = new LinkedList<>();
    public MyHashSet() {
    }
    
    public void add(int key) {
        if (!Set.contains(key)){
            Set.addLast(key);
        }    
    }
    
    public void remove(int key) {
        if (Set.contains(key)){
            Set.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        if (Set.contains(key)){
            return true;
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