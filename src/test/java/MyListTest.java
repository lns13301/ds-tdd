import org.junit.Test;
import static org.junit.Assert.*;

public class MyListTest {

    @Test
    public void testMyListCreated() {
        MyList<String> myList = new MyList<>();
        assertEquals(myList.size(), 0);
    }

    @Test
    public void testMyListAdd() {
        MyList<String> myList = new MyList<>();
        myList.add("element0");
        myList.add("element1");
        myList.add("element2");
        myList.add("element3");
    }

}