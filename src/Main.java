import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array1 =List.of(1,2,3,4,4,4,5,5,1);
        List<Integer> array2 = List.of(1,2,3,4,4,4,5,5,1);
        DuplicationLimitedList<Integer> list1=
                new DuplicationLimitedList<>(3,array1);
        DuplicationLimitedList<Integer> list2=
                new DuplicationLimitedList<>(6,array2);
       // System.out.println(list1.add1(1));
       // System.out.println(list1.countElementInList(4));
      list1.remove1(4);
     list1.print();
      //  System.out.println(list1.getFrequencyMap());
      //  list1.merge(list2);
    }

}