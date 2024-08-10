/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int [] a={5,3,2,1,-2};
        boolean swap;

        for(int i=0;i<a.length;i++){
            swap=false;
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
                
            }
            if(swap==false){
                break;
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
    }
}
}