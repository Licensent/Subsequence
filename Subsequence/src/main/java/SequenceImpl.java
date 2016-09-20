import java.util.List;

/**
 * Created by DarthVader on 08.09.2016.
 */
public class SequenceImpl implements Subsequence {
    public static void main(String[] args) {
        Sequences a = new Sequences();
        Subsequence b = new SequenceImpl();
        /*System.out.println(a.c1);
        System.out.println(a.c2);
        a.c2.retainAll(a.c1);
        System.out.println(a.c1);
        System.out.println(a.c2);
        System.out.println(a.c1.containsAll(a.c2));*/
        b.find(a.c1, a.c2);

    }

    public boolean find(List x, List y) {
        if (x.size() <= y.size()) {
            y.retainAll(x);
            if (x.size() == y.size()) {
                for (int j = 0; j <= x.size() - 1; j++) {
                    if (x.get(j) != y.get(j)) {
                        System.out.println("false");
                        return false;
                    }
                }
            }
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
