public class App {
    public static void main(String[] args) {
        System.out.println(Hello,Welcome to my Caesar-cipher Website.);
        while (true){
            System.out.println(Select "e" for encryption or "d" for decryption);
            Scanner input= new Scanner(Scanner.in);
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("e")){
                System.out.println("Input The Test For Encryption");
                String planeText = input.nextLine().toLowerCase();
                System.out.println("Input The Random Value");
                int num = input.nextInt();
                App message = new App(planeText, num);
                System.out.println("plane Text:" + message.getMessage() + "/n new value of:" + message.getNum());
                System.out.println("Encrypt Test:" + message.encryption());
                break;

            }
            else if (choice.equals("d")){
                System.out.println("Input Test to Decrypt");
                String encryptedText = input.nextLine().toLowerCase();
                System.out.println("Enter numValue");
                int reversValue = input.nextInt();
                App encryptText = new App(encryptedText, reversValue);
                System.out.println("decrypted message:" + encryptText.decryption());
                break;
            }
            else if {
                System.out.println("invalid choice");
            }
        }
    }
}
