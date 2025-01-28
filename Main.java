import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        OddArrayList oddList = new OddArrayList(1, 2, 3, 4, 7, 9, -13);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7, 9, -13));

        addRandomNumber(oddList);
        addRandomNumber(list);

        System.out.println("OddList: " + oddList);
        System.out.println("List: " + list);
    }

    public static void addRandomNumber(ArrayList<Integer> list) {
        Random random = new Random();
        int originalSize = list.size();
        while (list.size() == originalSize) {
            int randomNumber = random.nextInt(1000); // Generate a random number between 0 and 999
            list.add(randomNumber);
        }
    }
}