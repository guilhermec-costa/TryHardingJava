package app;

public class Phobia extends Fear {
    Phobia(String name, int level) {
        super(name, level);
    };
    
    @Override
    @VeryImportant(times = 3)
    public void feel() {
        System.out.printf("Feeling phobia %s \n", this.getName());
    }
    
    @VeryImportant(times = 5)
    public void notFeel() {
        System.out.printf("Not Feeling phobia %s \n", this.getName());
    }
}
