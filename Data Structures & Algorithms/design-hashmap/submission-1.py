class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value

class MyHashMap:

    def __init__(self):
        self.map = []
        

    def put(self, key: int, value: int) -> None:
        for node in self.map:
            if node.key == key:
                node.value = value
                return
        self.map.append(Node(key, value))
            
        
    def get(self, key: int) -> int:
        for node in self.map:
            if node.key == key:
                return node.value 
        return -1
        

    def remove(self, key: int) -> None:
        for node in self.map:
            if node.key == key:
                self.map.remove(node)
                return
        


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)