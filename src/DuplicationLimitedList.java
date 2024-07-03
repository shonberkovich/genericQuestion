import java.util.*;

public class DuplicationLimitedList <T> {
    private int maxDup;
    private List<T> duplicationLimitedList;

    public DuplicationLimitedList(int maxDup, List<T> DuplicationLimitedList) {
        this.maxDup = maxDup;
        this.duplicationLimitedList = new ArrayList<>();
        this.duplicationLimitedList.addAll(DuplicationLimitedList);
    }

    public boolean add1(T element) {
        boolean canAdd = false;
        int countDup = 0;
        for (T elementInList : this.duplicationLimitedList) {
            if (element == elementInList) {
                countDup++;
            }
        }
        if (countDup < this.maxDup) {
            canAdd = true;
        }
        return canAdd;
    }

    public int countElementInList(T element) {
        int countElementInList = 0;
        for (T elementInList : this.duplicationLimitedList) {
            if (element == elementInList) {
                countElementInList++;
            }
        }
        return countElementInList;
    }

    public void remove1(T element) {
        if (countElementInList(element) == 0) {
            System.out.println("nothing to remove");
        }
        if (countElementInList(element) == 1) {
            this.duplicationLimitedList.remove(element);
        }

        if (countElementInList(element) > 1) {
            Iterator<T> iterator = duplicationLimitedList.iterator();
            while (iterator.hasNext()) {
                T current = iterator.next();
                if (element.equals(current)) {
                    iterator.remove();
                    break;
                }
            }
        }
    }

    public Map<T, Integer> getFrequencyMap() {
        Map<T, Integer> FrequencyMap = new HashMap<>();

        for (T elementInList : this.duplicationLimitedList) {
            if (!FrequencyMap.containsKey(elementInList)) {
                FrequencyMap.put(elementInList, countElementInList(elementInList));

            }
        }
        return FrequencyMap;
    }

    public int getMaxDup() {
        return maxDup;
    }

    public List<T> getDuplicationLimitedList() {
        return duplicationLimitedList;
    }

    public void merge(DuplicationLimitedList<T> list2) {
        for (T elementInSecondList: list2.getDuplicationLimitedList()){
            if (add1(elementInSecondList)){
                this.duplicationLimitedList.add(elementInSecondList);
            }
        }
        print();
    }
    public void print() {
        StringBuffer sb = new StringBuffer();
        sb.append("the list is -> ").append(this.duplicationLimitedList);
        sb.append("the max dup is -> ").append(this.maxDup);
        System.out.println(sb);
    }
    }