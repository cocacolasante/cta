import java.util.Comparator;
import java.util.List;

public class SelectionSort {
    public static <T> void selectionSort(List<T> list, Comparator<T> comparator){
        int listSize = list.size();
        for(int i = 0; i < listSize -1; i++){
            int indexMin = i;
            for(int j = i+1; j < listSize; j++){
                if(comparator.compare(list.get(j), list.get(indexMin))<0){
                    indexMin = j;
                }
            }
            if(indexMin != 1 ){
                T temp = list.get(i);
                list.set(i, list.get(indexMin));
                list.set(indexMin, temp);
            }
        }
    }
}