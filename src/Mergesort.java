public class Mergesort {
    public static void main(String[] args) {
        int[] arr={8,6,9,4,5,2,1,3};
        mergesort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void mergesort(int[] arr) {
        int length= arr.length;
        if (length<=1)return;

        int mid=length/2;
        int[] LeftArray=new int[mid];
        int[] RightArray=new int[length-mid];
        int i=0,j=0;
        for (;i< length;i++){
            if (i<mid){
                LeftArray[i]=arr[i];
            }else{
                RightArray[j]=arr[i];
                j++;
            }
        }
        mergesort(LeftArray);
        mergesort(RightArray);
        merge(LeftArray,RightArray,arr);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] arr){
        int Leftsize=arr.length/2;
        int Rightsize=arr.length-Leftsize;
        int i=0,L=0,R=0;
        while (L<Leftsize && R<Rightsize){
            if (leftArray[L] <rightArray[R]){
                arr[i]=leftArray[L];
                L++;
                i++;
            }else{
                arr[i]=rightArray[R];
                R++;
                i++;
            }}
            while (L<Leftsize){
                arr[i]=leftArray[L];
                i++;
                L++;
            }
            while (R<Rightsize){
                arr[i]=rightArray[R];
                i++;
                R++;
            }
    }
}