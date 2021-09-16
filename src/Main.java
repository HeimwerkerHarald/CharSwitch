public class Main {
    public static void main(String[] args) {
        char charValue = 'B';
        switch (charValue){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("The letter " + charValue + " was found.");
                break;
            default:
                System.out.println("Could not find the letter A, B, C, D, or E.");


        }
        String month = "January";
        switch(month){
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}