class Question1{
public static void main(String[] args) {

    //Declaration and Initialization of an Array
    int[] a = {22,78,45,98,45,22,1,4,4};

    for(int i=0;i<a.length;i++){ //i=0 //i=1 //i=2 //i=3 //i=4 //i=5 //i=6
        for(int j=i+1;j<a.length;j++){ 
            if(a[i] == a[j]){ 
                System.out.println("Number " + a[j] + " duplicated.");  
          }    
          
        } 

    }

    // for(int i=0;i<a.length;i++){ //i=0 //i=1 //i=2 //i=3 //i=4 //i=5 //i=6
    //     for(int j=i+1;j<a.length;j++){ 
    //         //j=1 //j=2 //j=3 //j=4 //j==5 j=6
    //         //j=2 //j=3 //j=4 //j=5 //j=6
    //         //j=3 //j=4 //j=5 //j=6
    //         //j=4 //j=5 //j=6
    //         //j=5 //j=6
    //         //j=6
    //         if(a[i] == a[j]){  
    //         //10 == 20 // 10 ==78 // 10==78 // 10==10 // 10==10 //10==20
    //         //20 == 78 // 20 ==78 // 20==10 // 20==10 // 20==20
    //         //78 == 78 // 78 == 10 // 78==10 // 78==20
    //         //78 == 10 // 78==10 //78==20
    //         //10==10  //10==20
    //         //10==20
    //             counter++;
    //             System.out.println("Number " + a[i] + " duplicated " + counter);  
    //       }    
    //       counter =0;
    //     } 

    // }
}
}