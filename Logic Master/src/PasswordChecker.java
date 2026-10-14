public class PasswordChecker {
    public static void main(String[] args){
        String password = "Alok@123";
        if(password == null || password.length() < 8){
            System.out.println("Password length less than 8");
            return;
        }

        boolean hasDigit = false;

        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if(ch >= 48 && ch <= 57){
                hasDigit = true;
                break;
            }
        }

        if(hasDigit){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid!");
        }
    }
}
