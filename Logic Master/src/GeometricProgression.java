public class GeometricProgression {
    public static boolean isGP(int a, int b, int c){
        return (b*b)==(a*c);
    }

    public static void main(String[] args){
        System.out.println(isGP(10, 20, 30));
        System.out.println(isGP(5, 10, 20));
        System.out.println(isGP(2, 4, 8));
        System.out.println(isGP(3, 6, 12));
    }
}
