
package DataStructures;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedAndArrayList {

public static void main(String[] args) {

    LinkedList<Integer> linkedLists = new LinkedList<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    long startTime;
    long endTime;
    long elapsedTime;

    for (int i = 0; i < 100000; i++) {
        linkedLists.add(i);
        arrayList.add(i);
    }

    startTime= System.nanoTime();

    // linkedLists.get(0);
    linkedLists.get(50000);

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("LinkedList: " + elapsedTime);


    startTime= System.nanoTime();

    // arrayList.get(0);
    linkedLists.get(50000);

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("ArrayList: " + elapsedTime);

}
    
}
