import java.util.Objects;

public class Dog implements Comparable<Dog> {

  private String name;
  private int age;
  private String color;

  public Dog() {}

  public Dog(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Dog name(String name) {
    setName(name);
    return this;
  }

  public Dog age(int age) {
    setAge(age);
    return this;
  }

  public Dog color(String color) {
    setColor(color);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Dog)) {
      return false;
    }
    Dog dog = (Dog) o;
    return (
      Objects.equals(name, dog.name) &&
      age == dog.age &&
      Objects.equals(color, dog.color)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, color);
  }

  @Override
  public String toString() {
    return (
      "{" +
      " name='" +
      getName() +
      "'" +
      ", age='" +
      getAge() +
      "'" +
      ", color='" +
      getColor() +
      "'" +
      "}"
    );
  }

  @Override
  public int compareTo(Dog dog) {
    return dog.getAge() - this.getAge();
  }
}
