public class DigitSumProduct {
    public static boolean isSumGreaterThanProduct(int num){
        if(num < 1 || num > 9999){
            return false;
        }

        int sum=0;
        int product = 1;
        int temp = num;
        while(temp>0){
            int digit = temp %10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum>product;
    }

    public static void main(String[] args){
        System.out.println("Input 508: " + isSumGreaterThanProduct(508));
        System.out.println("Input 1115: " + isSumGreaterThanProduct(1115));
        System.out.println("Input 1: " + isSumGreaterThanProduct(1));
        System.out.println("Input 234: " + isSumGreaterThanProduct(234));
        System.out.println("Input 9999: " + isSumGreaterThanProduct(9999));
    }
}
