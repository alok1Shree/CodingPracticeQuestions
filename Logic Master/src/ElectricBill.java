public class ElectricBill {
    public static void main(String[] args){
        float electricUnit = 1000.55f;
        if(electricUnit < 100){
            double electricBill = electricUnit * 5.0;
            System.out.println("Rs. "+electricBill);
        }else if(electricUnit >= 100 && electricUnit <= 150){
            double electricBill = electricUnit * 10.0;
            System.out.println("Rs. "+electricBill);
        }else if(electricUnit >= 150){
            double electricBill = electricUnit * 12.50;
            System.out.println("Rs. "+electricBill);
        }else{
            System.out.println("Check with Bijli board");
        }
    }
}
