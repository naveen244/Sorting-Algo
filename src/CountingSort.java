public class CountingSort {
    public static void main(String[] args){
        int[] array ={9,8,5,7,1,6,4,7,10,7};
        countingsort(array,1,10);

        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void countingsort(int[] input,int min,int max){
        int[] countArray=new int[(max - min) +1];
        for (int i=0;i<input.length;i++){
            countArray[input[i]-min]++;
        }
        int j=0;
        for (int i=min;i<=max;i++){
            while (countArray[i -min] >0){
                input[j++] =i;
                countArray[i -min]--;
            }
        }

    }

}