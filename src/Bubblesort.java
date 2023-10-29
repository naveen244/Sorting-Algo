public class Bubblesort {
    public static void swap(int[] array,int i,int j){
        if(i ==j){
            return;
        }
        int temp = array[i];
        array[i]= array[j];
        array[j]= temp;


    }
    public static void main(String[] args){
        int[] array = {20,35,-15,7,55,1,-22};
        for (int lastSortedIndex = array.length - 1 ;lastSortedIndex > 0;lastSortedIndex--){
            for (int i=0;i<lastSortedIndex;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
        for (int i:array){
            System.out.println(i);
        }

    }
}