public class DateChecker {
    public static int compareDates(int day1, int month1, int day2, int month2) {
        if(month1 < month2)
            return -1;
        else if(month1 > month2)
            return 1;
        else{
            if(day1 < day2)
                return -1;
            else if(day1 > day2)
                return 1;
            else
                return 0;
        }
    }

    public static void main(String[] args){
        int result1 = compareDates(15, 5, 10, 8);
        System.out.println(result1);

        // Test 2: Same month, different days (October 25th vs October 5th)
        int result2 = compareDates(25, 10, 5, 10);
        System.out.println(result2);

        // Test 3: Same exact date (January 1st)
        int result3 = compareDates(1, 1, 1, 1);
        System.out.println(result3);
    }
}
