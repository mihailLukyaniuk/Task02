package Task02;
/**
  * The DataTypesTester class tests all allowed operations on primitive
  * data types (byte, short, int, long, float, double, char, boolean)
  */
public class DataTypesTester {
	
	public static void testByte() {
		byte a = 3, b = 4, c; 
		 
	    System.out.println("\n***** Arithmetical Operators *****"); 
	 
	    // addition 
	    c = (byte) (a + b); 
	    System.out.printf("%d + %d = %d\n", a, b, c); 
	    // subtraction 
	    c = (byte) (a - b); 
	    System.out.printf("%d - %d = %d\n", a, b, c); 
	    // multiplication 
	    c = (byte) (a * b); 
	    System.out.printf("%d * %d = %d\n", a, b, c); 
	    // division 
	    c = (byte) (a / b); 
	    System.out.printf("%d / %d = %d\n", a, b, c); 
	    // modulus 
	    c = (byte) (a % b); 
	    System.out.printf("%d %% %d = %d\n", a, b, c); 
	    try {
            c = (byte) (a / 0);
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %d = (byte) %d / 0\n", c, a);
        }
        //modulus
        c = (byte) (a % b);
        System.out.printf("modulus: %d = (byte) %d %% %d\n", c, a, b);
        try {
            c = (byte) (a % 0);
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %d = (byte) %d %% 0\n", c, a);
        }
	 
	    a = 3; 
	    // unary minus 
	    c = (byte) -a;  
	    System.out.printf("-%d = %d\n", a, c); 
	    // unary plus 
	    c = (byte) +a; 
	    System.out.printf("+%d = %d\n", a, c); 
	    // prefix increment 
	    a = 3; 
	    System.out.printf("++%d = %d\n", a, ++a); 
	    // postfix increment 
	    a = 3; 
	    System.out.printf("%d++ = %d\n", a, a++); 
	    // prefix decrement 
	    a = 3; 
	    System.out.printf("--%d = %d\n", a, --a); 
	    // postfix decrement 
	    a = 3; 
	    System.out.printf("%d-- = %d\n", a, a--); 
	 
	    System.out.println("\n***** Bitwise Operators *****"); 
	    System.out.println("Cannot be applied");
	 
	    System.out.println("\n***** Assignment Operators *****"); 
	 
	    c = 5; 
	    System.out.printf("%d += %d --> c = %d\n", c, a, c += a); 
	    c = 5; 
	    System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
	    c = 5; 
	    System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a); 
	    c = 5; 
	    System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
	    c = 5; 
	    System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
	    c = 5; 
	    System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
	    c = 5; 
	    System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a); 
	    c = 5; 
	    System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
	    c = 5; 
	    System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
	    c = 5; 
	    System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
	    c = 5; 
	    System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 
	 
	     
	    System.out.println("\n***** Relational Operators *****"); 
	   
	    // greater than 
	    System.out.printf("%d > %d --> %b\n", a, b, a > b); 
	    // greater than or equal to 
	    System.out.printf("%d >= %d --> %b\n", a, b, a >= b); 
	    // less than 
	    System.out.printf("%d < %d --> %b\n", a, b, a < b); 
	    // less than or equal to 
	    System.out.printf("%d <= %d --> %b\n", a, b, a <= b); 
	    // equal to 
	    System.out.printf("%d == %d --> %b\n", a, b, a == b); 
	    // not equal to 
	    System.out.printf("%d != %d --> %b\n", a, b, a != b); 
	 
	    System.out.println("\n***** Logical Operations *****"); 
	 
	    // logical AND 
	    System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,  
	        (a > b) && (a > 0)); 
	 
	    // bitwise logical AND 
	    System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,  
	        (a > b) & (a > 0)); 
	 
	    // logical OR 
	    System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) || (b != 0)); 
	 
	    // bitwise logical OR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) | (b != 0)); 
	 
	    // logical XOR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) ^ (b != 0)); 
	 
	    // logical NOT 
	    System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b)); 
	 
	    System.out.println("\n***** Misc Operators *****"); 
	    System.out.println("\nCondition Operator:"); 
	 
	    System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,  
	        (a > b ? a : b)); 
	 
	    System.out.println("\nType Cast Operator:"); 
	 
//	    byte bt = 1; 
	    short sh = -32000; 
	    char ch = '\u0002'; 
	    long l = 100000000000000000L; 
	    float f = 1.9f; 
	    double d = 123456789.625; 
	    boolean bool = true; 
	    c = (byte) sh; 
	    System.out.printf("byte = short: c = %d --> c = %d\n", sh, c); 
	    c = (byte) ch; 
	    System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c); 
	    c = (byte) l; 
	    System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c); 
	    c = (byte) f; 
	    System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c); 
	    c = (byte) d; 
	    System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c); 
	    // c = (int)bool; 
	    System.out.printf("byte = boolean: Compile Error\n", 
	        bool); 

	}

	public static void testShort() {
		short a = 8, b = 7, c; 
		 
	    System.out.println("\n***** Arithmetical Operators *****"); 
	 
	    // addition 
	    c = (short) (a + b); 
	    System.out.printf("%d + %d = %d\n", a, b, c); 
	    // subtraction 
	    c = (short) (a - b); 
	    System.out.printf("%d - %d = %d\n", a, b, c); 
	    // multiplication 
	    c = (short) (a * b); 
	    System.out.printf("%d * %d = %d\n", a, b, c); 
	    // division 
	    c = (short) (a / b); 
	    System.out.printf("%d / %d = %d\n", a, b, c); 
	    // modulus 
	    c = (short) (a % b); 
	    System.out.printf("%d %% %d = %d\n", a, b, c); 
	    try {
            c = (short) (a / 0);
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %d = (short) %d / 0\n", c, a);
        }
        //modulus
        c = (short) (a % b);
        System.out.printf("modulus: %d = (short) %d %% %d\n", c, a, b);
        try {
            c = (short) (a % 0);
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %d = (short) %d %% 0\n", c, a);
        } 
	 
	    a = 5; 
	    // unary minus 
	    c = (short) -a;  
	    System.out.printf("-%d = %d\n", a, c); 
	    // unary plus 
	    c = (short) +a; 
	    System.out.printf("+%d = %d\n", a, c); 
	    // prefix increment 
	    a = 5; 
	    System.out.printf("++%d = %d\n", a, ++a); 
	    // postfix increment 
	    a = 5; 
	    System.out.printf("%d++ = %d\n", a, a++); 
	    // prefix decrement 
	    a = 5; 
	    System.out.printf("--%d = %d\n", a, --a); 
	    // postfix decrement 
	    a = 5; 
	    System.out.printf("%d-- = %d\n", a, a--); 
	 
	    System.out.println("\n***** Bitwise Operators *****"); 
	    System.out.println("Cannot be applied");
	 
	    System.out.println("\n***** Assignment Operators *****"); 
	 
	    c = 7; 
	    System.out.printf("%d += %d --> c = %d\n", c, a, c += a); 
	    c = 7; 
	    System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
	    c = 7; 
	    System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a); 
	    c = 7; 
	    System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
	    c = 7; 
	    System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
	    c = 7; 
	    System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
	    c = 7; 
	    System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a); 
	    c = 7; 
	    System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
	    c = 7; 
	    System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
	    c = 7; 
	    System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
	    c = 7; 
	    System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 
	 
	     
	    System.out.println("\n***** Relational Operators *****"); 
	   
	    // greater than 
	    System.out.printf("%d > %d --> %b\n", a, b, a > b); 
	    // greater than or equal to 
	    System.out.printf("%d >= %d --> %b\n", a, b, a >= b); 
	    // less than 
	    System.out.printf("%d < %d --> %b\n", a, b, a < b); 
	    // less than or equal to 
	    System.out.printf("%d <= %d --> %b\n", a, b, a <= b); 
	    // equal to 
	    System.out.printf("%d == %d --> %b\n", a, b, a == b); 
	    // not equal to 
	    System.out.printf("%d != %d --> %b\n", a, b, a != b); 
	 
	    System.out.println("\n***** Logical Operations *****"); 
	 
	    // logical AND 
	    System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,  
	        (a > b) && (a > 0)); 
	 
	    // bitwise logical AND 
	    System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,  
	        (a > b) & (a > 0)); 
	 
	    // logical OR 
	    System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) || (b != 0)); 
	 
	    // bitwise logical OR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) | (b != 0)); 
	 
	    // logical XOR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) ^ (b != 0)); 
	 
	    // logical NOT 
	    System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b)); 
	 
	    System.out.println("\n***** Misc Operators *****"); 
	    System.out.println("\nCondition Operator:"); 
	 
	    System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,  
	        (a > b ? a : b)); 
	 
	    System.out.println("\nType Cast Operator:"); 
	 
	    byte bt = 1; 
//	    short sh = -32000; 
	    char ch = '\u0002'; 
	    long l = 100000000000000000L; 
	    float f = 1.9f; 
	    double d = 123456789.625; 
	    boolean bool = true; 
	    c = bt; 
	    System.out.printf("short = byte: c = %d --> c = %d\n", bt, c); 
	    c = (short) ch; 
	    System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c); 
	    c = (short) l; 
	    System.out.printf("short = long: c = (short) %d --> c = %d\n", l, c); 
	    c = (short) f; 
	    System.out.printf("short = float: c = (short) %f --> c = %d\n", f, c); 
	    c = (short) d; 
	    System.out.printf("short = double: c = (short) %f --> c = %d\n", d, c); 
	    // c = (int)bool; 
	    System.out.printf("short = boolean: Compile Error\n", 
	        bool); 
	}
		
	public static void testInt() {
	
	    int a = 15, b = 7, c; 
	 
	    System.out.println("\n***** Arithmetical Operators *****"); 
	 
	    // addition 
	    c = a + b; 
	    System.out.printf("%d + %d = %d\n", a, b, c); 
	    // subtraction 
	    c = a - b; 
	    System.out.printf("%d - %d = %d\n", a, b, c); 
	    // multiplication 
	    c = a * b; 
	    System.out.printf("%d * %d = %d\n", a, b, c); 
	    // division 
	    c = a / b; 
	    System.out.printf("%d / %d = %d\n", a, b, c); 
	    // modulus 
	    c = a % b; 
	    System.out.printf("%d %% %d = %d\n", a, b, c); 
	    try {
	        c = a / 0;
	    } catch (ArithmeticException e) {
	        System.out.printf("***Arithmetic Exeption: %d = %d / 0\n", c, a);
	    }
	    //modulus
	    c = a % b;
	    System.out.printf("modulus: %d = %d %% %d\n", c, a, b);
	    try {
	        c = a % 0;
	    } catch (ArithmeticException e) {
	        System.out.printf("***ArithmeticException: %d = %d %% 0\n", c, a);
	    }
	 
	    a = 15; 
	    // unary minus 
	    c = -a;  
	    System.out.printf("-%d = %d\n", a, c); 
	    // unary plus 
	    c = +a; 
	    System.out.printf("+%d = %d\n", a, c); 
	    // prefix increment 
	    a = 15; 
	    System.out.printf("++%d = %d\n", a, ++a); 
	    // postfix increment 
	    a = 15; 
	    System.out.printf("%d++ = %d\n", a, a++); 
	    // prefix decrement 
	    a = 15; 
	    System.out.printf("--%d = %d\n", a, --a); 
	    // postfix decrement 
	    a = 15; 
	    System.out.printf("%d-- = %d\n", a, a--); 
	 
	    System.out.println("\n***** Bitwise Operators *****"); 
	 
	    c = a & b; // bitwise AND 
	    System.out.printf("%d & %d = %d\n", a, b, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(b), Integer.toBinaryString(c)); 
	 
	    c = a | b; // bitwise OR 
	    System.out.printf("%d | %d = %d\n", a, b, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(b), Integer.toBinaryString(c)); 
	 
	    c = a ^ b; // bitwise XOR 
	    System.out.printf("%d ^ %d = %d\n", a, b, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(b), Integer.toBinaryString(c)); 
	 
	    c = ~a; // bitwise unary compliment 
	    System.out.printf("~%d = %d\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("~%s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	    c = a << 1; // left shift 
	    System.out.printf("%d << 1 = %d\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	    c = a >> 1; // right shift 
	    System.out.printf("%d >> 1 = %d\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    a = -15; 
	    c = a >> 1; // right shift 
	    System.out.printf("%d >> 1 = %d\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    a = 15; 
	    c = a >>> 1; // zero fill right shift 
	    System.out.printf("%d >>> 1 = %d\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    a = -15; 
	    c = a >>> 1; // zero fill right shift 
	    System.out.printf("%d >>> 1 = %d\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    System.out.println("\n***** Assignment Operators *****"); 
	 
	    c = 8; 
	    System.out.printf("%d += %d --> c = %d\n", c, a, c += a); 
	    c = 8;
	    System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
	    c = 8;
	    System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a); 
	    c = 8;
	    System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
	    c = 8;
	    System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
	    c = 8;
	    System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
	    c = 8;
	    System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a); 
	    c = 8;
	    System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
	    c = 8;
	    System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
	    c = 8;
	    System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
	    c = 8;
	    System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 
	 
	     
	    System.out.println("\n***** Relational Operators *****"); 
	   
	    // greater than 
	    System.out.printf("%d > %d --> %b\n", a, b, a > b); 
	    // greater than or equal to 
	    System.out.printf("%d >= %d --> %b\n", a, b, a >= b); 
	    // less than 
	    System.out.printf("%d < %d --> %b\n", a, b, a < b); 
	    // less than or equal to 
	    System.out.printf("%d <= %d --> %b\n", a, b, a <= b); 
	    // equal to 
	    System.out.printf("%d == %d --> %b\n", a, b, a == b); 
	    // not equal to 
	    System.out.printf("%d != %d --> %b\n", a, b, a != b); 
	 
	    System.out.println("\n***** Logical Operations *****"); 
	 
	    // logical AND 
	    System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,  
	        (a > b) && (a > 0)); 
	 
	    // bitwise logical AND 
	    System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,  
	        (a > b) & (a > 0)); 
	 
	    // logical OR 
	    System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) || (b != 0)); 
	 
	    // bitwise logical OR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) | (b != 0)); 
	 
	    // logical XOR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) ^ (b != 0)); 
	 
	    // logical NOT 
	    System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b)); 
	 
	    System.out.println("\n***** Misc Operators *****"); 
	    System.out.println("\nCondition Operator:"); 
	 
	    System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,  
	        (a > b ? a : b)); 
	 
	    System.out.println("\nType Cast Operator:"); 
	 
	    byte bt = 1; 
	    short sh = -32000; 
	    char ch = '\u0002'; 
	    long l = 100000000000000000L; 
	    float f = 1.9f; 
	    double d = 123456789.625; 
	    boolean bool = true; 
	    c = bt; 
	    System.out.printf("int = byte: c = %d --> c = %d\n", bt, c); 
	    c = sh; 
	    System.out.printf("int = short: c = %d --> c = %d\n", sh, c); 
	    c = ch; 
	    System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c); 
	    c = (int) l; 
	    System.out.printf("int = long: c = (int) %d --> c = %d\n", l, c); 
	    c = (int) f; 
	    System.out.printf("int = float: c = (int) %f --> c = %d\n", f, c); 
	    c = (int) d; 
	    System.out.printf("int = double: c = (int) %f --> c = %d\n", d, c); 
	    // c = (int) bool; 
	    System.out.printf("int = boolean: Compile Error\n", 
			        bool); 
	
	}
	
	public static void testLong() {
		long a = 17L, b = 9L, c; 
		 
	    System.out.println("\n***** Arithmetical Operators *****"); 
	 
	    // addition 
	    c = a + b; 
	    System.out.printf("%d + %d = %d\n", a, b, c); 
	    // subtraction 
	    c = a - b; 
	    System.out.printf("%d - %d = %d\n", a, b, c); 
	    // multiplication 
	    c = a * b; 
	    System.out.printf("%d * %d = %d\n", a, b, c); 
	    // division 
	    c = a / b; 
	    System.out.printf("%d / %d = %d\n", a, b, c); 
	    // modulus 
	    c = a % b; 
	    System.out.printf("%d %% %d = %d\n", a, b, c); 
	    try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %d = %d / 0\n", c, a);
        }
        //modulus
        c = a % b;
        System.out.printf("modulus: %d = %d %% %d\n", c, a, b);
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %d = %d %% 0\n", c, a);
        }
	 
	    a = 17L; 
	    // unary minus 
	    c = -a;  
	    System.out.printf("-%d = %d\n", a, c); 
	    // unary plus 
	    c = +a; 
	    System.out.printf("+%d = %d\n", a, c); 
	    // prefix increment 
	    a = 17L; 
	    System.out.printf("++%d = %d\n", a, ++a); 
	    // postfix increment 
	    a = 17L; 
	    System.out.printf("%d++ = %d\n", a, a++); 
	    // prefix decrement 
	    a = 17L; 
	    System.out.printf("--%d = %d\n", a, --a); 
	    // postfix decrement 
	    a = 17L; 
	    System.out.printf("%d-- = %d\n", a, a--); 
	 
	    System.out.println("\n***** Bitwise Operators *****"); 
        System.out.println("Bitwise operators cannot be applied to long");
	 
	    System.out.println("\n***** Assignment Operators *****"); 
	 
	    c = 11L; 
	    System.out.printf("%d += %d --> c = %d\n", c, a, c += a); 
	    c = 11L;
	    System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
	    c = 11L;
	    System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a); 
	    c = 11L;
	    System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
	    c = 11L;
	    System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
	    c = 11L;
	    System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
	    c = 11L;
	    System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a); 
	    c = 11L;
	    System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
	    c = 11L;
	    System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
	    c = 11L;
	    System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
	    c = 11L;
	    System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 
	 
	     
	    System.out.println("\n***** Relational Operators *****"); 
	   
	    // greater than 
	    System.out.printf("%d > %d --> %b\n", a, b, a > b); 
	    // greater than or equal to 
	    System.out.printf("%d >= %d --> %b\n", a, b, a >= b); 
	    // less than 
	    System.out.printf("%d < %d --> %b\n", a, b, a < b); 
	    // less than or equal to 
	    System.out.printf("%d <= %d --> %b\n", a, b, a <= b); 
	    // equal to 
	    System.out.printf("%d == %d --> %b\n", a, b, a == b); 
	    // not equal to 
	    System.out.printf("%d != %d --> %b\n", a, b, a != b); 
	 
	    System.out.println("\n***** Logical Operations *****"); 
	 
	    // logical AND 
	    System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,  
	        (a > b) && (a > 0)); 
	 
	    // bitwise logical AND 
	    System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,  
	        (a > b) & (a > 0)); 
	 
	    // logical OR 
	    System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) || (b != 0)); 
	 
	    // bitwise logical OR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) | (b != 0)); 
	 
	    // logical XOR 
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,  
	        (a >= b) ^ (b != 0)); 
	 
	    // logical NOT 
	    System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b)); 
	 
	    System.out.println("\n***** Misc Operators *****"); 
	    System.out.println("\nCondition Operator:"); 
	 
	    System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,  
	        (a > b ? a : b)); 
	 
	    System.out.println("\nType Cast Operator:"); 
	 
	    byte bt = 1; 
	    short sh = -32000; 
	    char ch = '\u0002'; 
//	    long l = 100000000000000000L; 
	    float f = 1.9f; 
	    double d = 123456789.625; 
	    boolean bool = true; 
	    c = bt; 
	    System.out.printf("long = byte: c = %d --> c = %d\n", bt, c); 
	    c = sh; 
	    System.out.printf("long = short: c = %d --> c = %d\n", sh, c); 
	    c = ch; 
	    System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c); 
	    c = (long) f; 
	    System.out.printf("long = float: c = (long) %f --> c = %d\n", f, c); 
	    c = (long) d; 
	    System.out.printf("long = double: c = (long) %f --> c = %d\n", d, c); 
	    // c = (long) bool; 
	    System.out.printf("long = boolean: Compile Error\n", 
	        bool); 
	}
	
	public static void testDouble() {
		double a = 21.0d, b = 10.1d, c; 
		 
	    System.out.println("\n***** Arithmetical Operators *****"); 
	 
	    // addition 
	    c = a + b; 
	    System.out.printf("%f + %f = %f\n", a, b, c); 
	    // subtraction 
	    c = a - b; 
	    System.out.printf("%f - %f = %f\n", a, b, c); 
	    // multiplication 
	    c = a * b; 
	    System.out.printf("%f * %f = %f\n", a, b, c); 
	    // division 
	    c = a / b; 
	    System.out.printf("%f / %f = %f\n", a, b, c); 
	    // modulus 
	    c = a % b; 
	    System.out.printf("%f %% %f = %f\n", a, b, c); 
	    try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %f = %f / 0\n", c, a);
        }
        //modulus
        c = a % b;
        System.out.printf("modulus: %f = %f %% %f\n", c, a, b);
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %f = %f %% 0\n", c, a);
        }
	 
	    a = 21d; 
	    // unary minus 
	    c = -a;  
	    System.out.printf("-%f = %f\n", a, c); 
	    // unary plus 
	    c = +a; 
	    System.out.printf("+%f = %f\n", a, c); 
	    // prefix increment 
	    a = 21d; 
	    System.out.printf("++%f = %f\n", a, ++a); 
	    // postfix increment 
	    a = 21d; 
	    System.out.printf("%f++ = %f\n", a, a++); 
	    // prefix decrement 
	    a = 21d; 
	    System.out.printf("--%f = %f\n", a, --a); 
	    // postfix decrement 
	    a = 21d; 
	    System.out.printf("%f-- = %f\n", a, a--); 
	 
	    System.out.println("\n***** Bitwise Operators *****"); 
        System.out.println("Bitwise operators cannot be applied to double");
	 
	    System.out.println("\n***** Assignment Operators *****"); 
	 
	    c = 15d; 
	    System.out.printf("%f += %f --> c = %f\n", c, a, c += a); 
	    System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a); 
	    System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a); 
	    System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a); 
	    System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a); 

        System.out.println("\n <<=, >>=, >>>=, &=, ^=, |= cannot be applied to double");
	 
	     
	    System.out.println("\n***** Relational Operators *****"); 
	   
	    // greater than 
	    System.out.printf("%f > %f --> %b\n", a, b, a > b); 
	    // greater than or equal to 
	    System.out.printf("%f >= %f --> %b\n", a, b, a >= b); 
	    // less than 
	    System.out.printf("%f < %f --> %b\n", a, b, a < b); 
	    // less than or equal to 
	    System.out.printf("%f <= %f --> %b\n", a, b, a <= b); 
	    // equal to 
	    System.out.printf("%f == %f --> %b\n", a, b, a == b); 
	    // not equal to 
	    System.out.printf("%f != %f --> %b\n", a, b, a != b); 
	 
	    System.out.println("\n***** Logical Operations *****"); 
	 
	    // logical AND 
	    System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,  
	        (a > b) && (a > 0)); 
	 
	    // bitwise logical AND 
	    System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,  
	        (a > b) & (a > 0)); 
	 
	    // logical OR 
	    System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,  
	        (a >= b) || (b != 0)); 
	 
	    // bitwise logical OR 
	    System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,  
	        (a >= b) | (b != 0)); 
	 
	    // logical XOR 
	    System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,  
	        (a >= b) ^ (b != 0)); 
	 
	    // logical NOT 
	    System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b)); 
	 
	    System.out.println("\n***** Misc Operators *****"); 
	    System.out.println("\nCondition Operator:"); 
	 
	    System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,  
	        (a > b ? a : b)); 
	 
	    System.out.println("\nType Cast Operator:"); 
	 
	    byte bt = 1; 
	    short sh = -32000; 
	    char ch = '\u0002'; 
	    long l = 100000000000000000L; 
	    float f = 1.9f; 
//	    double d = 123456789.625; 
	    boolean bool = true; 
	    c = bt; 
	    System.out.printf("double = byte: c = %d --> c = %f\n", bt, c); 
	    c = sh; 
	    System.out.printf("double = short: c = %d --> c = %f\n", sh, c); 
	    c = ch; 
	    System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c); 
	    c = l; 
	    System.out.printf("double = long: c = %d --> c = %f\n", l, c); 
	    c = f; 
	    System.out.printf("double = float: c = %f --> c = %f\n", f, c); 
	    // c = (double) bool; 
	    System.out.printf("double = boolean: Compile Error\n", 
	        bool); 
	}
	
	public static void testFloat() {
		float a = 11.1f, b = 9.0f, c; 
		 
	    System.out.println("\n***** Arithmetical Operators *****"); 
	 
	    // addition 
	    c = a + b; 
	    System.out.printf("%f + %f = %f\n", a, b, c); 
	    // subtraction 
	    c = a - b; 
	    System.out.printf("%f - %f = %f\n", a, b, c); 
	    // multiplication 
	    c = a * b; 
	    System.out.printf("%f * %f = %f\n", a, b, c); 
	    // division 
	    c = a / b; 
	    System.out.printf("%f / %f = %f\n", a, b, c); 
	    // modulus 
	    c = a % b; 
	    System.out.printf("%f %% %f = %f\n", a, b, c); 
	    try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %f = %f / 0\n", c, a);
        }
        //modulus
        c = a % b;
        System.out.printf("modulus: %f = %f %% %f\n", c, a, b);
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %f = %f %% 0\n", c, a);
        }
	 
	    a = 11.1f; 
	    // unary minus 
	    c = -a;  
	    System.out.printf("-%f = %f\n", a, c); 
	    // unary plus 
	    c = +a; 
	    System.out.printf("+%f = %f\n", a, c); 
	    // prefix increment 
	    a = 11.1f; 
	    System.out.printf("++%f = %f\n", a, ++a); 
	    // postfix increment 
	    a = 11.1f; 
	    System.out.printf("%f++ = %f\n", a, a++); 
	    // prefix decrement 
	    a = 11.1f; 
	    System.out.printf("--%f = %f\n", a, --a); 
	    // postfix decrement 
	    a = 11.1f; 
	    System.out.printf("%f-- = %f\n", a, a--); 
	 
	    System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Bitwise operators cannot be applied to double");

	 
	    System.out.println("\n***** Assignment Operators *****"); 
	 
	    c = 7.2f; 
	    System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
	    c = 7.2f;
	    System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a); 
	    c = 7.2f;
	    System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a); 
	    c = 7.2f;
	    System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a); 
	    c = 7.2f;
	    System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a); 
        System.out.println("\n <<=, >>=, >>>=, &=, ^=, |= cannot be applied to double");
	 
	     
	    System.out.println("\n***** Relational Operators *****"); 
	   
	    // greater than 
	    System.out.printf("%f > %f --> %b\n", a, b, a > b); 
	    // greater than or equal to 
	    System.out.printf("%f >= %f --> %b\n", a, b, a >= b); 
	    // less than 
	    System.out.printf("%f < %f --> %b\n", a, b, a < b); 
	    // less than or equal to 
	    System.out.printf("%f <= %f --> %b\n", a, b, a <= b); 
	    // equal to 
	    System.out.printf("%f == %f --> %b\n", a, b, a == b); 
	    // not equal to 
	    System.out.printf("%f != %f --> %b\n", a, b, a != b); 
	 
	    System.out.println("\n***** Logical Operations *****"); 
	 
	    // logical AND 
	    System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,  
	        (a > b) && (a > 0)); 
	 
	    // bitwise logical AND 
	    System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,  
	        (a > b) & (a > 0)); 
	 
	    // logical OR 
	    System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,  
	        (a >= b) || (b != 0)); 
	 
	    // bitwise logical OR 
	    System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,  
	        (a >= b) | (b != 0)); 
	 
	    // logical XOR 
	    System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,  
	        (a >= b) ^ (b != 0)); 
	 
	    // logical NOT 
	    System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b)); 
	 
	    System.out.println("\n***** Misc Operators *****"); 
	    System.out.println("\nCondition Operator:"); 
	 
	    System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,  
	        (a > b ? a : b)); 
	 
	    System.out.println("\nType Cast Operator:"); 
	 
	    byte bt = 1; 
	    short sh = -32000; 
	    char ch = '\u0002'; 
	    long l = 100000000000000000L; 
//	    float f = 1.9f; 
	    double d = 123456789.625; 
	    boolean bool = true; 
	    c = bt; 
	    System.out.printf("float = byte: c = %d --> c = %f\n", bt, c); 
	    c = sh; 
	    System.out.printf("float = short: c = %d --> c = %f\n", sh, c); 
	    c = ch; 
	    System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c); 
	    c = l; 
	    System.out.printf("float = long: c = %d --> c = %f\n", l, c); 
	    c = (float) d; 
	    System.out.printf("float = double: c = (float) %f --> c = %f\n", d, c); 
	    // c = (float) bool; 
	    System.out.printf("float = boolean: Compile Error\n", 
	        bool); 

	}
	
	
	
	public static void testChar() {
		char a = 'A', b = 'P', c; 
		 
	    System.out.println("\n***** Arithmetical Operators *****"); 
	 
	    // addition 
	    c =  (char) (a + b); 
	    System.out.printf("%c + %c = %c\n", a, b, c); 
	    // subtraction 
	    c =  (char) (a - b); 
	    System.out.printf("%c - %c = %c\n", a, b, c); 
	    // multiplication 
	    c =  (char) (a * b); 
	    System.out.printf("%c * %c = %c\n", a, b, c); 
	    // division 
	    c =  (char) (a / b); 
	    System.out.printf("%c / %c = %c\n", a, b, c); 
	    // modulus 
	    c =  (char) (a % b); 
	    System.out.printf("%c %% %c = %c\n", a, b, c); 
	    try {
            c =  (char) (a / 0);
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %c =  (char) %c / 0\n", c, a);
        }
        //modulus
        c =  (char) (a % b);
        System.out.printf("modulus: %c =  (char) %c %% %c\n", c, a, b);
        try {
            c =  (char) (a % 0);
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %c =  (char) %c %% 0\n", c, a);
        }
	 
	    a = 'A'; 
	    // unary minus 
	    c =  (char) (-a);  
	    System.out.printf("-%c = %c\n", a, c); 
	    // unary plus 
	    c =  (char) (+a); 
	    System.out.printf("+%c = %c\n", a, c); 
	    // prefix increment 
	    a = 'A'; 
	    System.out.printf("++%c = %c\n", a, ++a); 
	    // postfix increment 
	    a = 'A'; 
	    System.out.printf("%c++ = %c\n", a, a++); 
	    // prefix decrement 
	    a = 'A'; 
	    System.out.printf("--%c = %c\n", a, --a); 
	    // postfix decrement 
	    a = 'A'; 
	    System.out.printf("%c-- = %c\n", a, a--); 
	 
	    System.out.println("\n***** Bitwise Operators *****"); 
	 
	    c =(char) (a & b); // bitwise AND 
	    System.out.printf("%c & %c = %c\n", a, b, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(b), Integer.toBinaryString(c)); 
	 
	    c =(char) (a | b); // bitwise OR 
	    System.out.printf("%c | %c = %c\n", a, b, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(b), Integer.toBinaryString(c)); 
	 
	    c =(char) (a ^ b); // bitwise XOR 
	    System.out.printf("%c ^ %c = %c\n", a, b, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(b), Integer.toBinaryString(c)); 
	 
	    c =(char) (~a); // bitwise unary compliment 
	    System.out.printf("~%c = %c\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("~%s = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	    c =(char) (a << 1); // left shift 
	    System.out.printf("%c << 1 = %c\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	    c =(char) (a >> 1); // right shift 
	    System.out.printf("%c >> 1 = %c\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    a = 'Z'; 
	    c =(char) (a >> 1); // right shift 
	    System.out.printf("%c >> 1 = %c\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    a = 'A'; 
	    c =(char) (a >>> 1); // zero fill right shift 
	    System.out.printf("%c >>> 1 = %c\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    a = 'Z'; 
	    c =(char) (a >>> 1); // zero fill right shift 
	    System.out.printf("%c >>> 1 = %c\n", a, c); 
	    System.out.println("in binary form:"); 
	    System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), 
	        Integer.toBinaryString(c)); 
	 
	    System.out.println("\n***** Assignment Operators *****"); 
	 
	    c = 'G'; 
	    System.out.printf("%c += %c --> c = %c\n", c, a, c += a); 
	    c = 'G';
	    System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a); 
	    c = 'G';
	    System.out.printf("%c *= %c--> c = %c\n", c, a, c *= a); 
	    c = 'G';
	    System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a); 
	    c = 'G';
	    System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a); 
	    c = 'G';
	    System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a); 
	    c = 'G';
	    System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a); 
	    c = 'G';
	    System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a); 
	    c = 'G';
	    System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1); 
	    c = 'G';
	    System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1); 
	    c = 'G';
	    System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1); 
	 
	     
	    System.out.println("\n***** Relational Operators *****"); 
	   
	    // greater than 
	    System.out.printf("%c > %c --> %b\n", a, b, a > b); 
	    // greater than or equal to 
	    System.out.printf("%c >= %c --> %b\n", a, b, a >= b); 
	    // less than 
	    System.out.printf("%c < %c --> %b\n", a, b, a < b); 
	    // less than or equal to 
	    System.out.printf("%c <= %c --> %b\n", a, b, a <= b); 
	    // equal to 
	    System.out.printf("%c == %c --> %b\n", a, b, a == b); 
	    // not equal to 
	    System.out.printf("%c != %c --> %b\n", a, b, a != b); 
	 
	    System.out.println("\n***** Logical Operations *****"); 
	 
	    // logical AND 
	    System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,  
	        (a > b) && (a > 0)); 
	 
	    // bitwise logical AND 
	    System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,  
	        (a > b) & (a > 0)); 
	 
	    // logical OR 
	    System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,  
	        (a >= b) || (b != 0)); 
	 
	    // bitwise logical OR 
	    System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,  
	        (a >= b) | (b != 0)); 
	 
	    // logical XOR 
	    System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,  
	        (a >= b) ^ (b != 0)); 
	 
	    // logical NOT 
	    System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b)); 
	 
	    System.out.println("\n***** Misc Operators *****"); 
	    System.out.println("\nCondition Operator:"); 
	 
	    System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b,  
	        (a > b ? a : b)); 
	 
	    System.out.println("\nType Cast Operator:"); 
	 
	    byte bt = 1; 
	    short sh = -32000; 
//	    char ch = '\u0002'; 
	    long l = 100000000000000000L; 
	    float f = 1.9f; 
	    double d = 123456789.625; 
	    boolean bool = true; 
	    c =  (char) (bt); 
	    System.out.printf("char = byte: c = (char) %d --> c = %c\n", bt, c); 
	    c =  (char) (sh); 
	    System.out.printf("char = short: c = (char) %d --> c = %c\n", sh, c); 
	    c =  (char) (l); 
	    System.out.printf("char = long: c = (char) %d --> c = %c\n", l, c); 
	    c =  (char) (f); 
	    System.out.printf("char = float: c = (char) %f --> c = %c\n", f, c); 
	    c =  (char) (d); 
	    System.out.printf("char = double: c = (char) %f --> c = %c\n", d, c); 
	    // c = (char) bool; 
	    System.out.printf("char = boolean: Compile Error\n", 
	        bool); 
	}
	
	
	
	public static void testBoolean() {
			    boolean a = true, b = false, c; 
			 
			    System.out.println("\n***** Arithmetical Operators *****"); 
			 
			    // c = a + b; // addition 
			    // c = a - b; // subtraction 
			    // c = a * b; // multiplication 
			    // c = a / b; // division 
			    // c = a % b; // modulus 
			    // c = -a; // unary minus 
			    // c = +a; // unary plus 
			    // c = ++a; // prefix increment 
			    // c = a++; // postfix increment 
			    // c = --a; // prefix decrement 
			    // c = a--; // postfix decrement 
			 
			    System.out.println("\n***** Bitwise Operators *****"); 
			 
			    c = a & b; // bitwise AND 
			    System.out.printf("%b & %b = %b\n", a, b, c); 
			 
			    c = a | b; // bitwise OR 
			    System.out.printf("%b | %b = %b\n", a, b, c); 
			 
			    c = a ^ b; // bitwise XOR 
			    System.out.printf("%b ^ %b = %b\n", a, b, c); 
			 
			    // c = ~a; // bitwise unary compliment 
			    // c = a << 1; // left shift 
			    // c = a >> 1; //right shift 
			    // c = a >>> 1; // zero fill right shift
			    System.out.println("\n***** Assignment Operators *****"); 
			    
			    System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a); 
			    System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a); 
			    System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a); 
			 
			    // c += a; 
			    // c -= a; 
			    // c *= a; 
			    // c /= a; 
			    // c %= a; 
			    // c >>= 1; 
			    // c <<= 1; 
			    // c >>>= 1; 
			 
			    System.out.println("\n***** Relational Operators *****"); 
			 
			    // equal to 
			    System.out.printf("%b == %b --> %b\n", a, b, a == b); 
			    // not equal to 
			    System.out.printf("%b != %b --> %b\n", a, b, a != b); 
			 
			    // c = a > b; // greater than 
			    // c = a >= b; // greater than or equal to 
			    // c = a < b; // less than 
			    // c = a <= b; // less than or equal to 
			 
			    System.out.println("\n***** Logical Operations *****"); 
			 
			    c = a && b; // logical AND 
			    System.out.printf("%b && %b = %b\n", a, b, c); 
			 
			    c = a || b; // logical OR 
			    System.out.printf("%b || %b = %b\n", a, b, c); 
			 
			    c = a ^ b; // logical XOR 
			    System.out.printf("%b ^ %b = %b\n", a, b, c); 
			 
			    // logical NOT 
			    System.out.printf("!%b --> %b\n", a, !a); 
			 
			    System.out.println("\n***** Misc Operators *****"); 
			 
			    System.out.println("\nCondition Operator:"); 
			 
			    System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b)); 
			 
			    System.out.println("\nType Cast Operator:"); 
			 
//			    byte bt = 1; 
//			    short sh = -32000; 
//			    char ch = '\u0002'; 
//			    long l = 100000000000000000L; 
//			    float f = 1.9f; 
//			    double d = 123456789.625; 
			    boolean bool = true; 
			    
//			    c = (boolean) bt; 
//			    c = (boolean) sh;  
//			    c = (boolean) ch; 
//			    c = (boolean) l; 
//			    c = (boolean) f; 
//			    c = (boolean) d; 
			     c = bool; 

	}
	
	public static void testStudent() {

        Student student1 = new Student("Jack", 20);
        Student student2 = new Student("Mike", 21);
        Student student3;

        System.out.println("***** Arithmetical Operators *****");
        System.out.println("Cannot be applied");


        System.out.println("\n***** Relational Operators *****");
        System.out.println("Cannot be applied, method equals() could be used for comparison");

        System.out.println("\n***** Logical Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Assignment Operators*****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** TypeCast Operators *****");
        System.out.println("Incompatible types error");
    }

	public static void testString() {
        String a = "nice";
        String b = "day";
        String c;

        System.out.println("***** Arithmetical Operators *****");
        //addition +
        c = a + b;
        System.out.printf("addition: %s + %s = %s\n", a, b, c);

        System.out.println("\n***** Relational Operators *****");
        //equal to ==
        System.out.printf("equal to: %s == %s - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %s != %s - - > %b\n", a, b, a != b);
        System.out.println("Other operators, like >< are unavailable");

        System.out.println("\n***** Logical Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Assignment Operators*****");
        a = "nice";
        c = "isn't it";
        System.out.println("a = nice, c = isn't it, c += a --> " + "c = " + (c += a));

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** TypeCast Operators *****");
        byte b1 = 9;
        short sh = 25000;
        char c1 = 'C';
        int i = 14555;
        long l1 = 1_111_111_111_111L;
        float f1 = 2.122F;
        double d1 = 9.34;
        boolean bool = true;

        System.out.println("\n!! method toString() could be used\n");
        c = Byte.toString(b1);
        System.out.printf("String = byte: c = %d --> c = %s\n", b1, c);
        c = Short.toString(sh);
        System.out.printf("String = short: c = %d --> c = %s\n", sh, c);
        c = Character.toString(c1);
        System.out.printf("String = char: c = '%c' --> c = %s\n", c1, c);
        c = Integer.toString(i);
        System.out.printf("String = int: c = %d --> c = %s\n", i, c);
        c = Long.toString(l1);
        System.out.printf("String = long: c = %d --> c = %s\n", l1, c);
        c = Float.toString(f1);
        System.out.printf("String = float: c = %f --> c = %s\n", f1, c);
        c = Double.toString(d1);
        System.out.printf("String = double: c = %f --> c = %s\n", d1, c);
        c = Boolean.toString(bool);
        System.out.printf("String = boolean: c = %b --> c = %s\n", bool, c);
    }
}
