package app.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

import app.Fear;


/**
    Iterable:
        -> Produces an iterator to the the subinterfaces
        Collection:
            List:
                -> ListIterator: allows to iterate over an object forward and backward
            Set:
                SortedSet
            Queue:
                Deque

    Map:
        SortedMap
        NavigableMap

    Iterator (returned by the "iterator" method of the "Iterable" interface): enables you to iterate over a collection object
        -> Only allows to iterate in foward direction
 */

public class Collections {

    public static void Lists() {
        // List interface represents a ordered collection of elements ( can be repeated )
        List<Integer> numbers = new ArrayList<>(10);

        numbers.add(19);
        numbers.add(7);
        numbers.add(2);
        numbers.add(100);
        numbers.add(3);
        numbers.add(5);

        numbers.addAll(new ArrayList<Integer>(
            Arrays.asList(8, 105, 20, 45)
        ));


        numbers.stream()
            .map(n -> n * 2)
            .forEach(n -> System.out.println(n)
        );

        numbers.removeIf(n -> n > 50);
        System.out.println(numbers);

        numbers.remove(0);
        System.out.println(numbers);

        System.out.println();

        final var firstElementViaGetMethod = numbers.get(0);
        final var firstElementViaFirstMethod = numbers.getFirst();
        System.out.println(firstElementViaGetMethod + " | " + firstElementViaFirstMethod);

        Integer arraySize = numbers.size();
        System.out.println("Size: " + arraySize);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()) {
            var number = iterator.next();
        }

        for(Integer number : numbers) {
            // System.out.println(number);
        }

        for(Integer i=0; i<numbers.size(); ++i) {
            var number = numbers.get(i);
        }

        numbers.clear();
        System.out.println(numbers);

    }

    public static void Sets() {
        /*
         *  Set interface represents a unordered collection of unique elements
         *  unordered means that not always the elements are going to follow that they are inserted
         * */

        Set<String> unorderedNames = new HashSet<>();
        Set<String> orderedNames = new TreeSet<>(); // treeset keeps a order
        Set<Integer> numbers = Set.of(1, 2, 3, 4);

        unorderedNames.add("Churros");
        unorderedNames.add("Churros");
        unorderedNames.add("Churros");
        unorderedNames.add("Shoyou");
        unorderedNames.add("Shoyou");
        unorderedNames.add("Shoyou");
        unorderedNames.add("Boomer");
        unorderedNames.add("Boomer");
        unorderedNames.add("Boomer");


        orderedNames.add("Churros");
        orderedNames.add("Churros");
        orderedNames.add("Churros");
        orderedNames.add("Shoyou");
        orderedNames.add("Shoyou");
        orderedNames.add("Shoyou");
        orderedNames.add("Boomer");
        orderedNames.add("Boomer");
        orderedNames.add("Boomer");

        System.out.println(unorderedNames);
        System.out.println(orderedNames);
        System.out.println(numbers);


        Iterator<String> nameIterator = unorderedNames.iterator();
        while(nameIterator.hasNext()) {
            var name = nameIterator.next();
            System.out.println(name);
        }

        
        System.out.println("===============");
        for(String name : orderedNames) {
            System.out.println(name);
        }


        System.out.println("===============");
        Stream<String> stream = unorderedNames.stream();
        stream.forEach(name -> System.out.println(name));

        Boolean wasRemoved = unorderedNames.remove("Shoyou");
        System.out.println(unorderedNames);
        System.out.println("Was it removed: " + wasRemoved);

        orderedNames.clear();
        System.out.println(orderedNames);

        Set<Double> randomNumbers = new HashSet<>( Set.of( 1.0, 2.0, 3.0, 4.0 ));
        Set<Double> otherRandomNumbers = new HashSet<>( Set.of( 7.0, 2.0, 3.0, 9.0, 10.0 ));
        randomNumbers.retainAll(Set.of( 7.0, 2.0, 3.0, 9.0, 10.0 ) );
        // retains only the elements that are contained in both collections
        System.out.println(randomNumbers);
        
        System.out.println("Size of the set: " + randomNumbers.size());
        System.out.println("Is the set empty: " + randomNumbers.isEmpty());

        randomNumbers.clear();
        System.out.println("And now: " + randomNumbers.isEmpty());
    }

    public static void Maps() {

        // keys and values can not be primitives
        // if primitives are passed, autoboxing is used
        // in other words, the primitives are converted to its correspondent wrapper class
        // each key-value pair is called a entry

        Map<String, Fear> fearsMapV1 = new HashMap<>();
        Map<String, Fear> fearsMapV2 = new HashMap<>();
        Map<String, Fear> fearsTreeMap = new TreeMap<>();
        Map<String, Fear> fearsHashtable = new Hashtable<>();

        Fear ofOcean = new Fear("ocean", 4); 
        Fear ofDogs = new Fear("dogs", 3); 
        Fear ofLions = new Fear("lions", 2); 

        Fear ofCamels = new Fear("camels", 4); 
        Fear ofCats = new Fear("cats", 3); 
        Fear ofDragons = new Fear("dragons", 2); 
        Fear ofBees = new Fear("Bees", 1);

        String oceanFearId = ofOcean.getUUID();
        String dogsFearId = ofDogs.getUUID();
        String lionsFearId = ofLions.getUUID();

        String camelsFearId = ofCamels.getUUID();
        String catsFearId = ofCats.getUUID();
        String dragonsFearId = ofDragons.getUUID();

        fearsMapV1.put(oceanFearId, ofOcean);
        fearsMapV1.put(dogsFearId, ofDogs);
        fearsMapV1.put(lionsFearId, ofLions);

        fearsMapV2.put(camelsFearId, ofCamels);
        fearsMapV2.put(catsFearId, ofCats);
        fearsMapV2.put(dragonsFearId, ofDragons);

        fearsMapV1.get(oceanFearId).feel();
        fearsMapV1.get(dogsFearId).feel();
        fearsMapV1.get(lionsFearId).feel();

        fearsMapV1.remove(oceanFearId);
        fearsMapV2.remove(dogsFearId);

        Map<String, Fear> allFears = new HashMap<>();
        allFears.putAll(fearsMapV1);
        allFears.putAll(fearsMapV2);
        allFears.get(camelsFearId).feel();
        
        // now, the cats id holds data about the bees
        allFears.replace(ofCats.getUUID(), ofBees);

        System.out.println("Size of the map: " + allFears.size());
        System.out.println("Is the map empty: " + allFears.isEmpty());
        System.out.println("Contains the key \"abc\": " + allFears.containsKey("abc"));
        System.out.println("Contains the value \"ofCamels\": " + allFears.containsValue(ofCamels));

        allFears.get(ofCats.getUUID()).feel();
        System.out.println("=========================");

        Iterator<String> mapIterator = allFears.keySet().iterator();
        while(mapIterator.hasNext()) {
            String nextId = mapIterator.next();
            Fear nextFear = allFears.get(nextId);
            System.out.println(nextId);
            nextFear.feel();
        }


        System.out.println("=========================");
        for(String key : allFears.keySet()) {
            Fear currentFear = allFears.get(key);
            System.out.println(key);
            currentFear.feel();
        }

        allFears.clear();
        System.out.println(allFears);
    }
}
