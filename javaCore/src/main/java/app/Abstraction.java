package app;

public abstract class Abstraction {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

    void method() {
        System.out.println("method on abstraction");
    };
}
