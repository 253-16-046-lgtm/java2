public class DataTypesDemo {
    public static void main(String[] args) {
        byte b = 100;              // 1 byte
        short s = 30000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes

        float f = 3.14f;           // 4 bytes
        double d = 3.14159265359;  // 8 bytes

        char c = 'A';              // 2 bytes (Unicode character)
           char c = 'A';              // 2 bytes (Unicode character)
        boolean flag = true;       // Boolean value

        String str = "Hello, Java";
        int[] arr = {1, 2, 3, 4, 5};
        Integer wrapperInt = Integer.valueOf(50);
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("StringBuilder: " + sb);
    }
}