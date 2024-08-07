

 class pattern {                                        //time complexity       space       
    public static void main(String[] args) {            //1                     
        for(int i=1;i<=4;i++){                          //n+1                   1
            for(int j=1;j<=4;j++){                      //n(n+1)                1
                System.out.print("*");              //n*n
            }
            System.out.println();                       //n                     
        }
    }                                                  //2+2n^2+3n              1
}                                                      //n^2+3n     
                                                       //O(n^2)                 O(1)