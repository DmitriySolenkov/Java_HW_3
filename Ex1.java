import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = ((int) (Math.random() * 201 - 100));
        }
        int[] result = arraySorting(arr);
        for (int num : result) {
            System.out.format("%s ", num);
        }
    }

    public static int[] arraySorting(int[] arr) {
        int[] buf1 = Arrays.copyOf(arr, arr.length);
        int[] buf2 = new int[arr.length];
        int[] result = secondSorting(buf1, buf2, 0, arr.length);
        return result;
    }

    public static int[] secondSorting(int[] buf1, int[] buf2,
            int indexStart, int indexEnd) {
        if (indexStart >= indexEnd - 1) {
            return buf1;
        }
        int middle = indexStart + (indexEnd - indexStart) / 2;
        int[] sorted1 = secondSorting(buf1, buf2, indexStart, middle);
        int[] sorted2 = secondSorting(buf1, buf2, middle, indexEnd);
        int index1 = indexStart;
        int index2 = middle;
        int mainIndex = indexStart;
        int[] result = sorted1 == buf1 ? buf2 : buf1;
        while (index1 < middle && index2 < indexEnd) {
            result[mainIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[mainIndex++] = sorted1[index1++];
        }
        while (index2 < indexEnd) {
            result[mainIndex++] = sorted2[index2++];
        }
        return result;
    }
}