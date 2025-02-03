import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConditionArrayList oddList = new ConditionArrayList();
        oddList.addAll(Arrays.asList(1, 2, 3, 4, 7, 9, -13));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7, 9, -13));
        ModArrayList modList = new ModArrayList(3);
        modList.addAll(Arrays.asList(3, 6, 9, 12, 15, 18));

        addRandomNumber(oddList);
        addRandomNumber(list);
        addRandomNumber(modList);

        System.out.println("OddList: " + oddList);
        System.out.println("List: " + list);
        System.out.println("ModList: " + modList);
    }

    public static void addRandomNumber(ArrayList<Integer> list) {
        Random random = new Random();
        int originalSize = list.size();
        while (originalSize + 1 != list.size()) {
            int randomNumber = random.nextInt(1000);
            list.add(randomNumber);
        }
    }
}
