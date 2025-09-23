// Data Types - two types - primitive Data type - non primitive Data Type
// Primitive Data Type - two type - Numeric (integer, float, double) - Non Numeric (char, Boolean)
// Non Primitive Data Type - String, class, interface, arrays, collections

class DataTypes {
    public static void main(String args[]) {
        int a = 10;
        byte aa = 121;
        short aaa = 101;
        float b = 3.14f;
        double c = 4.12233423d;
        char d = 'g';
        Boolean e = false;
        Boolean f = true;
        long g = 1231213132;
        String name = "   Seshu Yaswanth Reddy   ";

        System.out.println("Name: " + name.toLowerCase());
        System.out.println("Name: " + name.length());
        System.out.println("Index of \"Yaswanth\": " + name.indexOf("Yaswanth"));
        System.out.println("Char at: " + name.charAt(name.length() - 1));
        System.out.println("Equals: " + name.equals("Sesu Yaswanth Reddy"));
        System.out.println(name.trim());
        System.out.println("int: " + a);
        System.out.println("byte: " + aa);
        System.out.println("short: " + aaa);
        System.out.println("floatt: " + b);
        System.out.println("double: " + c);
        System.out.println("char: " + d);
        System.out.println("Boolean: " + e);
        System.out.println("Boolean: " + f);
        System.out.println("long: " + g); 
        System.out.println("Byte Size: " + Byte.SIZE);
        System.out.println("Short Size: " + Short.SIZE);
        System.out.println("Integer Size: " + Integer.SIZE);
        System.out.println("Long Size: " + Long.SIZE);
        System.out.println("Byte Min Value: " + Byte.MIN_VALUE);
        System.out.println("Byte Max Value: " + Byte.MAX_VALUE);
        System.out.println("Short Min Value: " + Short.MIN_VALUE);
        System.out.println("Short Size: " + Short.MAX_VALUE);
        System.out.println("Integer Min Value: " + Integer.MIN_VALUE);
        System.out.println("Integer Size: " + Integer.MAX_VALUE);
        System.out.println("Long Min Value: " + Long.MIN_VALUE);
        System.out.println("Long Max Value: " + Long.MAX_VALUE);

        int[] arr;
        arr = new int[5];
        arr[0] = 7;
        arr[3] = 77;
        System.out.println("Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }    
}
