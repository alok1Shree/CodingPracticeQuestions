public class IsValidCalendarDate {
    public static boolean isValidCalendar(int day, int month){
        if(month < 1 || month > 12){
           return false;
        }

        int[] monthLengths = {31,28,31,30,31,30,31,31,30,31,31,30,31};
        if(day <1 || day > monthLengths[month-1]){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isValidCalendar(1,2));
        System.out.println(isValidCalendar(31, 1));
        System.out.println(isValidCalendar(31, 4));
        System.out.println(isValidCalendar(29, 2));
        System.out.println(isValidCalendar(15, 13));
        System.out.println(isValidCalendar(0, 5));
    }
}
