import java.util.Scanner;
public class App {
//    public Caesar() {

    public static void main(String[] args) {
        System.out.println("Hello,Welcome to my Caesar-cipher Website.");
        while (true){
            System.out.println("Select 'e' for encryption or 'd' for decryption");
            Scanner input= new Scanner(System.in);
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("e")){
                System.out.println("Input The Test For Encryption");
                String planeText = input.nextLine().toLowerCase();
                System.out.println("Input The Random Value");
                int num = input.nextInt();
                App message = new App();
                System.out.println("plane Text:" + message  + "/n new value of:" + message);
                System.out.println("Encrypt Test:" + message);
                break;

            }
            else if (choice.equals("d")){
                System.out.println("Input Test to Decrypt");
                String encryptedText = input.nextLine().toLowerCase();
                System.out.println("Enter numValue");
                int reversValue = input.nextInt();
                App encryptText = new App();
                System.out.println("decrypted message:" + encryptText);
                break;
            }
            else {
                System.out.println("invalid choice");
            }
        }
    }
}

