public class ArithmeticProgression {
    public static boolean isAP(int a, int b, int c){
        return (b-a)==(c-b);
    }

    public static void main(String[] args){
        System.out.println(isAP(2, 5, 8));
        System.out.println(isAP(10, 20, 30));
        System.out.println(isAP(5, 10, 20));
    }
}
