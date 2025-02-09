import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PrimeArrayList extends ArrayList<Integer> {

    @Override
    public boolean add(Integer integer) {
        if (isPrime(integer)) {
            return super.add(integer);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream().filter(PrimeArrayList::isPrime).collect(Collectors.toList()));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}