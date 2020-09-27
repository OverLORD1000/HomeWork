public class bitwise {
    public static void main(String[] args) {
        int o = 42;
        int a = 15;
        System.out.println(~o); // 42 = 101010  ~42 = 11010101 = -43 = 11_111_111_111_111_111_111_111_111_010_101
        System.out.println(~a); // 15 = 1111  ~15 = 11110000 = -16 = 11_111_111_111_111_111_111_111_111_110_000
        System.out.println(o & a); // 42 = 101010 & 15 = 1111 = 10 = 1010
        System.out.println(o &= a); // 42 = 101010 &= 15 = 1111 = 10 = 1010 но теперь o = 10
        if(o != 42) {
            o = 42;
        }
        System.out.println(a &= o); // 15 = 1111 &= 42 = 101010 = 10 = 1010 но теперь a = 10
        if(a != 15) {
            a = 15;
        }
        System.out.println(o | a); // 42 = 101010 | 15 = 1111 = 47 = 101111
        System.out.println(o |= a); // 42 = 101010 | 15 = 1111 = 47 = 101111  теперь o = 47
        if(o != 42) {
            o = 42;
        }
        System.out.println(o ^ a); // 42 = 101010 ^ 15 = 1111 = 37 = 00100101
        System.out.println(o ^= a); // 42 = 101010 ^= 15 = 1111 = 37 = 00100101  теперь o = 37
        if(o != 42) {
            o = 42;
        }
        System.out.println(o >> a); // 42 = 101010 >> 15 = 1111 = 0 = 0
        System.out.println(o >>= a); // 42 = 101010 >>= 15 = 1111 = 0 = 0 теперь o = 0
        if(o != 42) {
            o = 42;
        }
        System.out.println(o >>> a); //42 = 101010 >>> 15 = 1111 = 0 = 0
        System.out.println(o << a); //42 = 101010 << 15 = 1111 = 137625 = 101_010_000_000_000_000_000
        System.out.println(o <<= a); // 42 = 101010 <<= 15 = 1111 = 137625 = 101_010_000_000_000_000_000 теперь o = 137625
        if(o != 42) {
            o = 42;
        }
        System.out.println(o >>>= a); // 42 = 101010 >>>= 15 = 1111 = 0 = 0


    }
}
