public class IsPythagoreanTriplet {

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        if(a*a + b*b == c*c){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 5, b = 12, c = 13;
        System.out.println(isPythagoreanTriplet(a,b,c));
    }
}
