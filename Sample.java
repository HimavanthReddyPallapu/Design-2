// Time Complexity : constant
// Space Complexity : constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


import java.lang.Math;
class MyHashMap {
    int size=(int)Math.pow(10,6)+1;
    int hm[];

    public MyHashMap() {
        hm=new int[size];
        for(int i=0; i<size;i++)
        {
            hm[i]=-1;
        }
    }
    
    public void put(int key, int value) {
        
      hm[key]=value;
        
        
    }
    
    public int get(int key) {
        return hm[key];
        
    }
    
    public void remove(int key) {
        
        hm[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
