public class CheckCentury {
    public static int getCentury(int year){
        if(year <= 0){
            System.out.println("Invalid year");
            return -1;
        }

        return (year+1)/100;
    }

    public static void main(String[] args){
        System.out.println("Year 1900 is in the " + getCentury(1900) + "th Century"); // 19
        System.out.println("Year 1999 is in the " + getCentury(1999) + "th Century"); // 20
        System.out.println("Year 2000 is in the " + getCentury(2000) + "th Century"); // 20
        System.out.println("Year 2026 is in the " + getCentury(2026) + "st Century"); // 21
        System.out.println("Year 85   is in the " + getCentury(85)   + "st Century"); // 1
    }
}
