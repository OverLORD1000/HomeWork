public class bitwise {
    public static void main(String[] args) {
        int o = 42;
        int a = 15;
        System.out.println(~o); // 42 = 101010  ~42 = 11010101 = -43 = 11_111_111_111_111_111_111_111_111_010_101
        System.out.println(~a); // 15 = 1111  ~15 = 11110000 = -16 = 11_111_111_111_111_111_111_111_111_110_000
        System.out.println(o & a); // 42 = 101010 & 15 = 1111 = 10 = 1010
        System.out.println(o &= a); // 42 = 101010 &= 15 = 1111 = 10 = 1010
        if(o != 42) {
            o = 42;
        }
        System.out.println(a &= o); //
        if(a != 15) {
            a = 15;
        }
        System.out.println(o | a); //
        System.out.println(o |= a); //
        if(o != 42) {
            o = 42;
        }
        System.out.println(o ^ a);
        System.out.println(o ^= a);

    }
}
