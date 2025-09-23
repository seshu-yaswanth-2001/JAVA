public class Methods {
    static void addition(int num1, int num2) {
        System.err.println(num1 + num2);
    }

    static void ageChecker(int num1) {
        if(num1 > 18) {
            System.out.println("you are eligible");
        } else {
            System.out.println("you're not eligible");
        }
    }

    static int square(int x) {
        return x * x;
    }

    // Method overloading
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static String plusMethod(String name1 , String name2) {
        return name1 + name2;
    }

    public static void main(String[] args) {
     addition(1, 2);   
     ageChecker(20);
     ageChecker(2);
     for(int i = 0; i < 5; i++ ) {
        System.out.println(square(i));
     }
    System.out.println("Addition: " + plusMethod(4, 5));
    System.out.println("Concat: " + plusMethod("Seshu", "Yaswanth"));
    }
}
