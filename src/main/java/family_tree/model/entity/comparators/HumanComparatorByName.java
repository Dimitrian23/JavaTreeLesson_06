package family_tree.model.entity.comparators;

import family_tree.model.tree.FamilyTree;

import java.util.Comparator;

public class HumanComparatorByName <T extends FamilyTree> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
