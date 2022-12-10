import java.util.ArrayList;
import java.util.Collections;

class Main {

  public static void main(String[] args) {
    Dog d1 = new Dog("Tony", 2, "blue");
    Dog d2 = new Dog("Bob", 4, "green");
    Dog d3 = new Dog("Jack", 1, "red");

    Dog d4 = new Dog("Tony", 5, "blue");

    ArrayList<Dog> listOfDogs = new ArrayList<Dog>();
    listOfDogs.add(d1);
    listOfDogs.add(d1);
    listOfDogs.add(d1);

    for (Dog d : listOfDogs) {
      System.out.println(d);
    }

    Collections.sort(listOfDogs);

    System.out.println(listOfDogs.contains(d4));
  }
}
