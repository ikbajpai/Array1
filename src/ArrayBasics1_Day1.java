// This code is to print, add, update elements in an Array using function calls in Java.
public class ArrayBasics1_Day1 {
    public void printArray(int[] arr){
//        int n = arr.length;
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[] myArray = new int[5];

        myArray[0] = 1;
        myArray[1] = 13;
        myArray[2] = 112;
        myArray[3] = 13;
        myArray[4] = 15;
        printArray(myArray);

    }

    public static void main(String[] args) {
        ArrayBasics1_Day1 arrUtil = new ArrayBasics1_Day1();
        arrUtil.arrayDemo();
    }

}
