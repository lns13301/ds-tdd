import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MyListTest {

    private MyList<String> myList;

    @Before
    public void init(){
        myList = new MyList<>();
        myList.add("element0");
        myList.add("element1");
        myList.add("element2");
        myList.add("element3");
    }

    @Test
    public void testMyListCreated() {
        assertThat(myList).isNotNull();
    }

    @Test
    public void testMyListAdd() {
        assertThat(myList.size()).isEqualTo(4);
    }

    @Test
    public void testMyListAddLast() {
        myList.add(4,"element4");
        assertThat(myList.get(4)).isEqualTo("element4");
    }

    @Test
    public void testMyListAddAll() {
        List<String> addList = new ArrayList<>();
        addList.add("element4");
        addList.add("element5");
        myList.addAll(addList);
        assertThat(myList.get(5)).isEqualTo("element5");
        assertThat(myList.size()).isEqualTo(6);
    }

    @Test
    public void testMyListAddAllIndex() {
        List<String> addList = new ArrayList<>();
        addList.add("element4");
        addList.add("element5");
        myList.addAll(2,addList);
        assertThat(myList.get(3)).isEqualTo("element5");
        assertThat(myList.size()).isEqualTo(6);
    }

    @Test
    public void testMyListRemoveIndex() {
        myList.remove(2);
        assertThat(myList.get(3)).isEqualTo("element3");
        assertThat(myList.size()).isEqualTo(3);
    }

    @Test
    public void testMyListRemove() {
        myList.remove("element0");
        assertThat(myList.get(3)).isEqualTo("element3");
        assertThat(myList.size()).isEqualTo(3);
    }

    @Test
    public void testMyListRemoveAll() {
        List<String> removeList = new ArrayList<>();
        removeList.add("element1");
        removeList.add("element3");
        myList.removeAll(removeList);
        assertThat(myList.get(1)).isEqualTo("element2");
        assertThat(myList.size()).isEqualTo(2);
    }

    @Test
    public void testMyListContains() {
        assertThat(myList.contains("element1")).isTrue();
    }

    @Test
    public void testMyListContainsAll() {
        List<String> checkList = new ArrayList<>();
        checkList.add("element0");
        checkList.add("element2");
        assertThat(myList.contains(checkList)).isTrue();
    }

    @Test
    public void testMyListIterator(){
        Iterator<String> iterator = myList.iterator();
        List<String> resultList = new MyList<>();
        while(iterator.hasNext()){
            resultList.add(iterator.next());
        }
        assertThat(resultList.get(3)).isEqualTo("element3");
    }

    @Test
    public void testMyListSet() {
        myList.set(2, "new element");
        assertThat(myList.get(2)).isEqualTo("new element");
    }
}