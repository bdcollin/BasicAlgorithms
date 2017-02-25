/*
Blair C. Gentry
CSC 330 - Assignment 1
*/

import java.util.*;

class MapSwap {
/*
Swapped method is used to swap keys and values    
*/
    public static HashMap<String, String> Swapped(HashMap<String, String> map) throws DuplicateValueException {
        
        HashMap<String, String> swappedMap = new HashMap(); //create map to store swapped values
        Iterator keySet = map.keySet().iterator();  //create iterator

        while (keySet.hasNext()) {
            String key = keySet.next().toString();
            if (swappedMap.containsKey(map.get(key)))
            {
                throw new DuplicateValueException();
            } else 
            {
                swappedMap.put(map.get(key), key);
            }
        }
        return swappedMap;
    }

/*
printMap method: prints keys and values of a given map
*/
    private static void printMap(HashMap<String, String> map) {
        System.out.println(map);
    }

    public static void main(String[] args) throws DuplicateValueException {
        HashMap<String, String> states = new HashMap();
        states.put("ms", "Mississippi");
        states.put("nc", "North Carolina");
        states.put("ct", "Connecticut");

        printMap(states);
        printMap(Swapped(states));

        HashMap<String, String> id = new HashMap();
        id.put("10123", "John Adam");
        id.put("10124", "John Adam");
        id.put("10345", "Terry Page");

        printMap(id);
        System.out.println("");
        printMap(Swapped(id));
    }
}