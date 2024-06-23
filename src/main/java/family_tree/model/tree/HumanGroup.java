package family_tree.model.tree;

import family_tree.model.entity.comparators.HumanComparatorByAge;
import family_tree.model.entity.comparators.HumanComparatorByName;
import family_tree.model.tree.iterators.HumanIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HumanGroup<E extends FamilyTree> implements Iterable<E> {
    private List<E> humanList;

    public HumanGroup() {
        humanList = new ArrayList<>();
    }

    public void addHuman(E student) {

        humanList.add(student);
    }

    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(humanList);
    }

    public void sortByName() {
        humanList.sort(new HumanComparatorByName());
    }

    public void sortByAge() {
        humanList.sort(new HumanComparatorByAge());
    }
}
