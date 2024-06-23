package family_tree.model.entity.comparators;

import family_tree.model.tree.FamilyTree;
import family_tree.model.tree.HumanGroup;

import java.util.Comparator;

public class HumanComparatorByAge<T extends FamilyTree> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
