// Type Conversions: two type - widering type conversions - narrowing type conversions
// widering type conversions (Automatically) -
//          No loss of Data (or) Implicit type conversion (Small to Big) - Byte -> Short -> Int -> Long -> Float -> Double.
// narrowing type conversions (Manually) - 
//          loss of Data (or) Explicit type conversion (Big to Small) - Double -> Float -> Long -> Int -> Short -> Byte.

class TypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion
        int a = 99;
        double b = a;
        System.out.println(a);
        System.err.println(b);
        // Explicit Type conversion
        double c = 9.081;
        int d = (int) c;
        System.out.println(c);
        System.out.println(d);
    }    
}
