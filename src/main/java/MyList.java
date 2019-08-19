import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<String> implements List<String> {

    private int size;
    private String[] array;

    public MyList() {
        this.size = 0;
        this.array = (String[]) new Object[1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String element) {
        if(size >= array.length){
            String[] bigger = (String[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        remove(indexOf(o));
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        boolean flag = true;

        for(String element : c)
            flag &= add(element);

        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        for(String element : c)
            add(index, element);

        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = true;

        for(Object element : c)
            flag &= remove(element);
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String get(int index) {
        if(index >= array.length){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(size >= array.length){
            String[] bigger = (String[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        size++;
        array[index] = element;
    }

    @Override
    public String remove(int index) {
        String element = array[index];
        for(int i = index; i < size - 1; i++){
            array[i] = array[i+1];
        }
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++){
            if(array[i].equals((String) o))
                return i;
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
