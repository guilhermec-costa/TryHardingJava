package app;

public class Cat implements IPrintable, IPrey {
    public String name;
    public int age;

    public Cat() {}

	@Override
        public void print(String suffix) {
        System.out.println(suffix);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

    @Override
    public void flee() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'flee'");
    }
}
