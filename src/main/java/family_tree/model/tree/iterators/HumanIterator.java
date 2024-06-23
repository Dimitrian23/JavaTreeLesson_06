package family_tree.model.tree.iterators;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<E> implements Iterator<E> {
    private int index;
    private List<E> studentList;

    public HumanIterator(List<E> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public E next() {
        return studentList.get(index++);
    }
}
