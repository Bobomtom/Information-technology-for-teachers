public class Variables {
    byte aByte = 0; // numbers from -27 to 27-1
    Byte aByte1 = 0; //numbers from -27 to 27-1 includes null

    short aShort = 0; //numbers from -215 to 215-1
    Short aShort1 = 0; //numbers from -215 to 215-1 includes null

    int anInt = 0; //numbers from -2147483648 (-2^31) to 2147483647 (2^31 -1)
    Integer anInt1 = 0; //numbers from -2147483648 (-2^31) to 2147483647 (2^31 -1) includes null

    long aLong = 0L; //numbers from -263 to 263-1
    Long aLong1 = 0L; //numbers from -263 to 263-1 includes null

    float aFloat = 0.0f; //numbers from +/-1,4E-45 to +/-3,4E+38
    Float aFloat1 = 0.0f; //numbers from +/-1,4E-45 to +/-3,4E+38 includes null

    double aDouble = 0.0d; //numbers from +/-4,9E-324 to +/-1,7E+308
    Double aDouble1= 0.0d; //numbers from +/-4,9E-324 to +/-1,7E+308 includes null

    boolean aBoolean = false; //true or false
    Boolean aBoolean1 = false; //true or false includes null

    /**
     * char variables aren´t for calculating stuff, they are used to describe characters,
     * such as letters of the alphabet with numbers. For that a char uses UTF16-encodings.
     * For counting, it uses the hexadecimal system instead of decimal.
     */
    char aChar = 0x0030; //numbers from 0 to 65535
    Character aChar1 = 0x0030; //numbers from 0 to 65535 includes null
}