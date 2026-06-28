class MyHashSet:
    falseArray = []*1000001 #since 0 <= key <= 1,000,000 (using boolean array)
    def __init__(self):
        self.falseArray = [False] * 1000001  # key range is fixed
        

    def add(self, key: int) -> None:
        self.falseArray[key] = True
        

    def remove(self, key: int) -> None:
        self.falseArray[key] = False

    def contains(self, key: int) -> bool:
        return self.falseArray[key]


        


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)