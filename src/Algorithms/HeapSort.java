package Algorithms;

public class HeapSort {

    public void part(int[] array) {


        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }


//        for(int i=middle; i< array.length;i++){
//            if(array[2*i] < array[i]){
//                array = swap(array,(2*i),i);
//
//            }
//            if(array[(2*i)+1] < array[i]){
//                array = swap(array,(2*i)+1,i);
//
//            }
//        }
    }

    public void heapify(int[] arr, int length, int i) {

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < length && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < length && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
//            int swap = arr[i];
//            arr[i]= arr[largest];
//            arr[largest] = swap;
            arr =swap(arr, i, largest);
            heapify(arr,length,largest);
        }
    }

    public int[] swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
        return  array;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {

        int[] array = {40, 60, 10, 20, 50, 30};
        HeapSort s = new HeapSort();
        s.part(array);
        s.print(array);

    }
}
