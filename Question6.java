public class Question6{
    public static void main(String[] args) {
        int[] a = {20,30,70,80,90,40};
        int[] b = {30,70,9};
        int counter=0;

        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i] == a[j]){
                   counter++;
                   break;
                }
                
            }

        }
        if(b.length==counter){
            System.out.println("Array b is subset of Array a");
        }else{
            System.out.println("Array b is Not subset of Array a");
        }
    }
}