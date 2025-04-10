package Sorting;

public class MergeSortProgram {
    int[] Array;
    int[] tempMergeArray;
    int length;

    public static void main(String[] args) {
        int[] inputArr = {48, 38, 13, 52, 19, 94, 21};
        MergeSortProgram ms = new MergeSortProgram();
        ms.sort(inputArr);
        System.out.print("Sorted Array: ");
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int inputArr[]) {
        this.Array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArray = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lower, int higher) {
        if (lower < higher) {
            int mid = lower + (higher - lower) / 2;
            divideArray(lower, mid);
            divideArray(mid + 1, higher);
            mergeArray(lower, mid, higher);
        }
    }

    public void mergeArray(int lower, int mid, int higher) {
        for (int i = lower; i <= higher; i++) {
            tempMergeArray[i] = Array[i];
        }
        int i = lower;
        int j = mid + 1;
        int k = lower;

        while (i <= mid && j <= higher) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                Array[k] = tempMergeArray[i];
                i++;
            } else {
                Array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            Array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }
}
