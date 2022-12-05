import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int index = 0; index < 10; index++) {
            list.add((int) (Math.random() * 201 - 100));
        }
        System.out.println(list);
        list = deleteEven(list);
        System.out.println(list);
    }

    public static ArrayList<Integer> deleteEven(ArrayList<Integer> list) {
        for (int index = 0; index < list.size();) {
            if (list.get(index) % 2 == 0) {
                list.remove(index);
            } else {
                index++;
            }
        }
        return list;
    }
}
