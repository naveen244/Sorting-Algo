public class quicksort {
    public static void main(String[] args){
        int[] array ={2,6,1,3,8,5,9,4,7};
        QuickSort(array,0,array.length-1);
        for (int i:array){
            System.out.print(i+" ");
        }
    }

    private static void QuickSort(int[] array, int start, int end) {
        if (start>=end)return;
        int pivot=partition(array,start,end);
        QuickSort(array,start,pivot-1);
        QuickSort(array,pivot+1,end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot=end;
        int i=start-1;
        for (int j=start;j<=end-1;j++){
            if (array[j]<array[pivot]){
                i++;
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        i++;
        int temp=array[i];
        array[i]=array[pivot];
        array[pivot]=temp;
        return i;
    }
}