import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int index = 0; index < 10; index++) {
            list.add((int) (Math.random() * 21));
        }
        System.out.println(list);
        int min = findMin(list);
        int max = findMax(list);
        float average = findAverage(list);
        System.out.format("Мимимальное значение- %s, максимальное значение- %s, среднее арифметическое- %s.", min, max,
                average);
    }

    public static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static float findAverage(ArrayList<Integer> list) {
        float result = 0;
        for (int num : list) {
            result = result + num;
        }
        result = result / list.size();

        return result;
    }
}
