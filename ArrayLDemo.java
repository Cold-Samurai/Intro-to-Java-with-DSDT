import java.util.ArrayList;

class ArrayLDemo {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();

    // add elements in the array list
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Horse");
    
    System.out.println("ArrayList: " + animals);

    animals.remove("Horse");
    System.out.println("Updated List: " + animals);

    animals.add("Wolverine");
    animals.add("Cow");
    System.out.println("New List: " + animals);
  }
}