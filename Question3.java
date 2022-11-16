public class Question3 {
    public static void main(String[] args) {
        int[] a = {10,40,20,80,70,90,50,20};
        int n= a.length;

        System.out.println("******Before Shorting*****");
        for(int ele:a){
            System.out.print(" " + ele);
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(a[j]<a[j-1]){
                    int tempValue = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tempValue;
                }
            }   
        }
        System.out.println();
        System.out.println("******After Shorting*****");
        for(int ele:a){
            System.out.print(" " + ele);
        }
    }
}
