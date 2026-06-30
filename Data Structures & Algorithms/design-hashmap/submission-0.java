class MyHashMap {
    LinkedList<Node> Map = new LinkedList<>(); //using linkedlist
    
    class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {}

    public void put(int key, int value) {
        for (Node node : Map){ // Map stores LinkedList<Node> So each element is a Node
            if (node.key == key){ //update key, if already contains key
                node.value = value;
                return;
            }
        }
        Node newNode = new Node(key, value); //otherwise create new node with key and value and add it to Map
        Map.add(newNode);  // or map.add(new Node(key, value));    
    }
    
    public int get(int key) {
        for (Node node : Map){
            if (node.key == key){ 
                return node.value;
            }
        }
        return -1;     
    }
    
    public void remove(int key) {
        Node nodeToRemove = null;

        for (Node node : Map) {
            if (node.key == key) {
                nodeToRemove = node;
                break;
            }
        }

        if (nodeToRemove != null) {
            Map.remove(nodeToRemove);
        }
    }
}



/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */