package app;

public class FStrings {
    public static void Start() {
        String churros = "churros";
        String dirtyChurros = "   churros   ";
        System.out.println(churros == "Churros");
        System.out.println(churros.equals("Churros"));
        System.out.println(churros.equalsIgnoreCase("churros"));
        System.out.println(churros.length());
        System.out.println(churros.charAt(1));
        System.out.println(churros.indexOf("h"));
        System.out.println(churros.isEmpty());
        System.out.println(churros.toUpperCase());
        System.out.println(churros.toLowerCase());
        System.out.println(churros.substring(0, 1).toUpperCase()
                           + churros.substring(1).toLowerCase());

        System.out.println(dirtyChurros.trim());
        System.out.println(churros.replace("rr", "ss"));
    }
}
