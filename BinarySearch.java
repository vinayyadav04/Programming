import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        
    
    int[] a={5,3,7,9,11,1,2,};

    Arrays.sort(a);

    int ele=24;boolean flag=false;

    int l=0;
    int r=a.length-1;
while(l<=r){
    int mid=(l+r)/2;
    if(ele==a[mid]){
        flag=true;
        break;
    }else if(ele>a[mid]){
        l=mid+1;
    }else{
        r=mid-1;
    }
}
    if(flag==true)
    System.out.println("element found");   
    else
    System.out.println("not found");
}
}

