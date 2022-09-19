import java.util.Collections;
import java.util.ArrayList;

class Algorithm {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(6);
        
        System.out.println("Unsorted ArrayList: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
       
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);

    }
}
    
