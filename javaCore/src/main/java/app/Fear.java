package app;

import java.util.UUID;

public class Fear {

    @FieldAnnotation
    private String name;
    private int level = 0;
    private UUID id;

    public Fear(String name, int level) {
        this.name = name;
        this.level = level;
        id = UUID.randomUUID();
    };

	public void feel() {
        System.out.printf("Feeling %s fear...\n", this.name);
    };
    
    @Override
    public String toString() {
        return String.format("Fear: %s | Level: %d", this.name, this.level);
    }

    public String getName() { return this.name; }
    
    // I'm really not good thinking on creative method names
    public void stickInYourAss() {
        String sentence = String.format("Sticking fear in your ass");
        System.out.println(sentence);
    }

    public String getUUID() {
        return this.id.toString();
    }
};
