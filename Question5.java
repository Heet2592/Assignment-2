public class Question5 {
    public static void main(String[] args) {
        int[] a = {10,40,80,70,50,60};

        int n = a.length;

        System.out.println("Before sorting");
        for(int ele:a){
            System.out.print(" " +ele);
        }

        for(int i=0;i<n;i++){

            
            for(int j=i+1;j<n;j++){
                if(a[j]<a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int ele:a){
            System.out.print(" "+ele);
        }
    }
}
