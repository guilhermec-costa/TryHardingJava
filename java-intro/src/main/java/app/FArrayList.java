package app;
import java.util.*;

public class FArrayList {
    public static void Start() {
        ArrayList<String> list = new ArrayList<>(
            Arrays.asList("teste1", "teste2")
        );
        // they store reference data type
        list.add("churros");
        list.add("shoyuou");

        List<String> dogs = new ArrayList<>();

        System.out.println(list.get(0));
        System.out.println(list.size());

        list.set(1, "getulio");
        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list.get(0));

        list.clear();
        System.out.println(list.size());

        Fear fear = new Fear("dark", 4);
        Phobia phobia = new Phobia("tassalophobia", 3);
        ArrayList<Fear> fears = new ArrayList<>();
        fears.add(new Fear("light", 1));
        fears.add(new Fear("frog", 3));
        fears.add(new Phobia("randomphobia", 1));

        phobia.feel();


        fears.get(0).feel();
    }
}
