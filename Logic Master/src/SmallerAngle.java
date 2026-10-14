public class SmallerAngle {
    public static double smallerAngleHoursMinute(int hour, int minute){
        int h = hour % 12;
        double hourAngle = (h*30)+(minute*0.5);
        double minuteAngle = (minute*6);
        double angle = Math.abs(hourAngle-minuteAngle);

        return Math.min(angle,360-angle);
    }

    public static void main(String[] args){
        System.out.println("Angle at 12:00 -> " + smallerAngleHoursMinute(12, 0) + "°");   // 0.0°
        System.out.println("Angle at 3:00  -> " + smallerAngleHoursMinute(3, 0) + "°");    // 90.0°
        System.out.println("Angle at 9:30  -> " + smallerAngleHoursMinute(9, 30) + "°");   // 105.0°
        System.out.println("Angle at 12:15 -> " + smallerAngleHoursMinute(12, 15) + "°");  // 82.5°
    }
}
