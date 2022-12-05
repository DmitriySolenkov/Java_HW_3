import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        for (int index = 0; index < 10; index++) {
            listA.add((int) (Math.random() * 21));
        }
        ArrayList<Integer> listB = new ArrayList<Integer>();
        for (int index = 0; index < 10; index++) {
            listB.add((int) (Math.random() * 21));
        }
        System.out.println(listA);
        System.out.println(listB);
        ArrayList<Integer> diffAB = diff(listA, listB);
        ArrayList<Integer> diffBA = diff(listB, listA);
        System.out.println("Числа из первой коллекции, которых нет во второй: ");
        System.out.println(diffAB);
        System.out.println("Числа из второй коллекции, которых нет в первой: ");
        System.out.println(diffBA);

        ArrayList<Integer> simDiff = new ArrayList<Integer>();
        for (int num : diffAB) {
            simDiff.add(num);
        }
        for (int num : diffBA) {
            simDiff.add(num);
        }
        System.out.println("Симметричная разность: ");
        System.out.println(simDiff);
    }

    public static ArrayList<Integer> diff(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        ArrayList<Integer> listDiff = new ArrayList<Integer>();
        for (int numA : listA) {
            boolean bool = true;
            for (int numB : listB) {
                if (numA == numB) {
                    bool = false;
                }
            }
            if (bool == true) {
                listDiff.add(numA);
            }
        }
        return listDiff;
    }
}
