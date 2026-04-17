package collectionFramework;

// /* Hash Map , Hash Set, ArrayList */  //

// 1.) ArrayList 

import java.util.*;

class TestArrayList {
    public static void main(String[] args) {
        
        // Declaration
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1. Duplicate allowed ✔
        list.add(10);
        list.add(20);
        list.add(10); 
        
        // 2. Order maintained ✔
        System.out.println(list); // [10, 20, 10]
        
        // 3. Index-based access ✔
        System.out.println("Element at index 1: " + list.get(1));
        
        
        list.add(null);   // 4. Allows null ✔
        System.out.println("After adding null: " + list);
        
        // 5. Size
        System.out.println("Size: " + list.size());
        
        // 6. Remove by index
        list.remove(0);
        System.out.println("After removal: " + list);
        
        // 7. Iteration
        for(Integer x : list){
            System.out.print(x + " ");
        }
    }
}


// 2.) HashMap 


// class HashMaptest {
//     public static void main(String[] args) {
        
     
//         HashMap<Integer, String> map = new HashMap<>();
        
//         // 1. Key-Value pair ✔
//         map.put(1, "A");
//         map.put(2, "B");
        
        
//         // 2. Duplicate key NOT allowed ❌ (overwrite)
//         map.put(1, "C"); 
//     //         key, value
        
        
//         // 3. Multiple values duplicate allowed ✔
//         map.put(3, "B");
        
//         System.out.println(map);  // {1=C, 2=B, 3=B}
        
//         // 4. One null key 
//         map.put(null, "X");
        
//         // 5. Multiple null values 
//         map.put(4, null);
//         map.put(5, null);
        
//         // 6. Order NOT maintained 
//         System.out.println("HashMap: " + map);
        
//         // 7. Access
//         System.out.println("Value of key 1: " + map.get(1));
        
//         // 8. Contains
//         System.out.println("Contains key 2? " + map.containsKey(2));
//         System.out.println("Contains value B? " + map.containsValue("B"));
        
//         // 9. Remove
//         map.remove(2);
//         System.out.println("After removal: " + map);
        
//         // 10. Size
//         System.out.println("Size: " + map.size());
        
//         // 11. Iteration
//         for(Map.Entry<Integer, String> e : map.entrySet()){
//             System.out.print(e.getKey() + " -> " + e.getValue());
//         }
//     }
// }


// 3.) HashSet

// import java.util.*;

// class TestHashSet {
//     public static void main(String[] args) {
        
//         // Declaration
//         HashSet<Integer> set = new HashSet<>();
        
//         // 1. Duplicate NOT allowed ❌
//         set.add(10);
//         set.add(20);
//         set.add(10); // ignored
        
//         // 2. Order NOT maintained ❌
//         System.out.println("HashSet: " + set);
        
//         // 3. Only one null allowed ✔
//         set.add(null);
//         set.add(null); // ignored
//         System.out.println("After adding null: " + set);
        
//         // 4. No index access ❌ (get() nahi hota)
        
//         // 5. Contains check
//         System.out.println("Contains 20? " + set.contains(20));
        
//         // 6. Remove
//         set.remove(10);
//         System.out.println("After removal: " + set);
        
//         // 7. Size
//         System.out.println("Size: " + set.size());
        
//         // 8. Iteration
//         for(Integer x : set){
//             System.out.println(x);
//         }
//     }
// }