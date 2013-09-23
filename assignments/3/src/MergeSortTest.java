import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: raph
 * Date: 9/23/13
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortTest {
    @Test
    public void testSort() throws Exception {

        Comparable[] a = new Comparable[]{4, 7, 9, 10};
        MergeSort.sort(a);
    }
}
