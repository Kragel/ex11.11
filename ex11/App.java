package t_11_holdingYourObjects.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        iterable(integerList);
        List<Integer> integerArrysList = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        iterable(integerArrysList);

        Set<Integer> integerSet = new HashSet<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        iterable(integerSet);
    }

    private static void iterable(Collection<?> collection)
    {
        Iterator<?> it = collection.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        System.out.println("\nDone.");
    }

}
