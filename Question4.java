public class Question4 {
    private static void mergeSort(int[] inputArray){
        int inputLenght = inputArray.length;
        if(inputLenght < 2){
            return;
        }
        int midLenght = inputLenght/2;
        int[] leftHalf = new int[midLenght];
        int[] rightHalf = new int[inputLenght-midLenght];

        for(int i=0;i<midLenght;i++){
            leftHalf[i] = inputArray[i];
        }
        for(int i=midLenght;i<inputLenght;i++){
            rightHalf[i-midLenght] = inputArray[i];
            
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }
    private static void merge(int[] inputArray,int[] leftHalf,int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0,j=0,k=0;
        while(i<leftSize && j<rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        //Adding remaning values to merged array
        while(i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j< rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    private static void printArray(int[] inputArray){
        for(int ele: inputArray){
            System.out.print(" " +ele);
        }

    }
          
    public static void main(String[] args) {
        int[] a = {10,50,70,40,20,8,90};
        Question4.printArray(a);
        Question4.mergeSort(a);
        System.out.println();
        System.out.println("***After Sorting***");
        Question4.printArray(a);
    }
}
