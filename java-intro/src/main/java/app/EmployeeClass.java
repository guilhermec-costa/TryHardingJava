package app;

import java.util.Objects;

public class EmployeeClass {
    private final String name;
    private final int Id;

    public EmployeeClass(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }

	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

    @Override
    public String toString() {
        return String.format("%s -> %d", this.name, this.Id);
    }

    @Override
    public int hashCode() {
            return Objects.hash(name, Id);
    }


}
