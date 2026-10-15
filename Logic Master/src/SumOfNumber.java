public class SumOfNumber {
    public static boolean checkDigitSum(int num){
        if(num <100 || num > 999){
            return false;
        }
        int firstNum = num /100;
        int secondNum = (num/10) %10;
        int thirdNum = num%10;

        return (firstNum + thirdNum) == secondNum;
    }

    public static void main(String[] args){
        System.out.println(checkDigitSum(154));
        System.out.println(checkDigitSum(286));
        System.out.println(checkDigitSum(123));
        System.out.println(checkDigitSum(505));
    }
}
