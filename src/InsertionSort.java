public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={9,5,6,2,4,1,7,3,8};
        insertionSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i=1;i< arr.length;i++){
            for (int j=i;j>0;j--){
                int temp;
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else break;
            }
        }
    }
}