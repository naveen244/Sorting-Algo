public class Challenge2 {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        insertionsort(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
    public static void insertionsort(int[] input,int num_items){
        num_items =input.length;
        if(num_items >2){
            return;
        }
        int newelement =input[num_items - 1];
        insertionsort(input,num_items -1);
        int i=0;
        for (i = num_items-1; i>0 && (input[i-1] > newelement); i--){
            input[i] =input[i-1];
        }
        input[i-1]= newelement;
    }
}
