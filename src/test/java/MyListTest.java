import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyListTest {

    @Test
    public void testMyListCreated() {
        MyList<String> myList = new MyList<>();
        assertThat(myList).isNotNull();
    }

    @Test
    public void testMyListAdd() {
        MyList<String> myList = new MyList<>();
        myList.add("element0");
        myList.add("element1");
        myList.add("element2");
        myList.add("element3");
        assertThat(myList.size()).isEqualTo(4);
    }

    @Test
    public void testMyListAddLast() {
        MyList<String> myList = new MyList<>();
        myList.add("element0");
        myList.add("element1");
        myList.add("element2");
        myList.add("element3");
        myList.add(4,"element4");
        assertThat(myList.get(4)).isEqualTo("element4");
    }
}