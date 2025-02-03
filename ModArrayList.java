import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ModArrayList extends ArrayList<Integer> {
    private int modValue;

    public ModArrayList(int modValue) {
        this.modValue = modValue;
    }

    @Override
    public boolean add(Integer integer) {
        if (integer % modValue == 0) {
            return super.add(integer);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream().filter(i -> i % modValue == 0).collect(Collectors.toList()));
    }
}