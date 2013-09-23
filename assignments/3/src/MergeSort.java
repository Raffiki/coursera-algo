/**
 * Created with IntelliJ IDEA.
 * User: raph
 * Date: 9/22/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {

    private static void merge (Comparable[] a, Comparable[] aux, int l, int m, int r) {

        for ( int i = 0; i < aux.length; i++) {
           aux[i] = a[i];
        }

        int i = l, j = m;
        for (int k = l; k < r; k++) {
            if (j >= r)                                  a[k] = aux[i++];
            else if(i >= m)                              a[k] = aux[j++];
            else if ((aux[i].compareTo(aux[j]) <= 0))    a[k] = aux[i++];
            else                                         a[k] = aux[j++];
        }
    }

    private static void sort (Comparable[] a, Comparable[] aux, int l, int r) {

        if (r <= l + 1) return;
        int m = l + (r - l) / 2;
        sort (a, aux, l, m);
        sort (a, aux, m, r);
        merge (a, aux, l, m, r);
    }

    public static void sort (Comparable[] a) {

        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, aux.length);
        System.out.print(a);
    }
}
