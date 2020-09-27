public class bitwise {
    public static void main(String[] args) {
        int o = 42;
        int a = 15;
        System.out.println(~o); // 42 = 101010  ~42 = 11010101 = -43 = 11_111_111_111_111_111_111_111_111_010_101
        System.out.println(~a); // 15 = 1111  ~15 = 11110000 = -16 = 11_111_111_111_111_111_111_111_111_110_000
        System.out.println(o & a); // 42 = 101010 & 15 = 1111 = 10 = 1010
        System.out.println(o &= a); // 42 = 101010 &= 15 = 1111 = 10 = 1010
       // System.out.println(a &= 42); // 42 = 101010 &= 15 = 00001111 = 10 = 00001010
       //System.out.println(o | a); // 42 = 00101010 | 15 = 00001111 = 47 = 00101111 на бумаге у меня выходит так, но idea компилирует 10 почему-то
        //System.out.println(o |= a); // ошибка
      // System.out.println(o ^ a);
       // System.out.println(o ^= a);

    }
}
