public class Question2 {
    private static void quickSort(int[]a,int lowIndex,int highIndex){   
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = a[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            //If the value is less than Pivot, we will increment leftPointer till we find the value greater than pivot. Once we find value greater than pivot we stop.
            while(a[leftPointer] <= pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while(a[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(a, leftPointer, rightPointer);
        }
        //once the leftPointer and rightPointer at the same position we change that value with pivot
        swap(a,leftPointer,highIndex);

        //After find position of pivot
        //sorting left side
        quickSort(a,lowIndex,leftPointer-1);
        //sorting right side
        quickSort(a,leftPointer+1,highIndex);

    }
    private static void swap(int[] a, int index1,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

    }

    private static void printArray(int[] a){
        for(int ele : a){
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {
        int[] a = {20,40,70,30,80,50};
        int n = a.length;
        Question2.printArray(a);

        System.out.println("***After Shorting******");
        Question2.quickSort(a, 0, n-1);
        Question2.printArray(a);
        
    }
}
