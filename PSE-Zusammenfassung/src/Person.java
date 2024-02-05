//This class is immutable

public class Person {
    final String name;
    final int age;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
//This is the same thing as the entire class
/*
 * public record Person(String name, int age) {}
 */
