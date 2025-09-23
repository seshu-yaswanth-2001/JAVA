public class Switchs {
    public static void main(String[] args) {
        int weekday = 4;
        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("No weekday available");
                break;
        }
    }
}