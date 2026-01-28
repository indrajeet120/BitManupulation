
// Q GET ith BIT

public class BitManupulation {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // SET Ith BIT
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // CLEAR Ith BIT

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // UPDATE Ith BIT
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit ==0){
        // return clearIthBit(n, i);
        // }else{
        // return setIthBit(n, i);
        // }

        // another method--
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    // clear last ith bit
    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // CLEAR RANGE OF BITS
    public static int clearBitinRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    
    //CHECK IF A NUMBER IS POWWER OF 2 OR NOT-----
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    

    //COUNT SET BITS IN NUMBER--
    public static int countSetBits(int n){
        int count = 0;
        while (n>0) {
            if((n&1) !=0){
                count++;
            }
            n = n>>1;
            
        }
        return count;
    }


    //FAST EXPONENTIATION-------

    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n>0) {
            if((n&1) !=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
            
        }
        return ans;
    }

    public static void main(String[] args) {
       // System.out.println(getIthBit(10, 3));
      // System.out.println(setIthBit(10, 2));
      //System.out.println(clearIthBit(10, 1));
      //System.out.println(updateIthBit(10, 2, 1));
      //System.out.println(clearIBits(15, 2));
      //System.out.println(clearBitinRange(10, 2, 4));
      //System.out.println(isPowerOfTwo(15));
      //System.out.println(countSetBits(15));
      System.out.println(fastExpo(5, 3));
    }

}
