import java.util.ArrayList;
import java.util.Random;

public class homework3{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i: list) {
        if (i%2==0) list1.add(i);
        }
      
        list.removeAll(list1);
        System.out.println(list);

        int min = list.get(0);
        for (int i: list) {
        if (i<min) min = i;    
        }
        System.out.printf("min: %d \n", min);

        int max = list.get(0);
        for (int i: list) {
        if (i>max) max = i;    
        }
        System.out.printf("max: %d \n", max);

        int sum = 0;
        for (int i: list) {
        sum+=i;
        }

        System.out.printf("average: %d",sum/list.size());
    }
}