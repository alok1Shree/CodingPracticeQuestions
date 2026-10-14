public class CheckAMOrPM {
    public static void main(String[] args){
        int hours = 14;
        if(hours >= 0 && hours <= 12){
            System.out.println(hours+ " It's AM");
        }else if(hours >= 12 && hours <= 18){
            System.out.println(hours+ " It's PM");
        }else{
            System.out.println("Invalid Hours");
        }
    }
}
