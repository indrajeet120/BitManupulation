public class odeeven {
    
//Q - check oddoreven---------------


public class BitManupulation {

    public static void oddorEven(int n){
        int bitMask =1;
        if((n&bitMask) == 0){
            //even number
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddorEven(9);
    }
}

}
