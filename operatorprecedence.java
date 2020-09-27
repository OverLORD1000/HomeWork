public class operatorprecedence {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
       // System.out.println(a + b / c); // первым деление 2/8 = 0.25 на бумаге, но для int = 0 + 5 = 5
        //System.out.println((a + b) / c); // в скобках сложение первым получили 7 делим на 8, на бумаге получаем 0.875 для int = 0
       // System.out.println((a + b++) / c); //
       // System.out.println((a + b++) / --c); // в скобках сложение первым, b = 3 c предыдущей операции

        //System.out.println((a * b >> b++) / --c); // с начала т.к пост-унарная операция b++ => 4
        // c прошлой операции добавилось 1, --с = 7 , затем 5 * b = 5  т.к. увеличилось на 1 от b++ => 25
        // 25 >> 4 т.е. 11001 >> 1 и делим на 7 = 0,14 для int = 0
       // int d = 7;
       // int f = 20;
        //int e = 68;
       // int w = 22;

        System.out.println((a + 7 > 20 ? 68 : 22 * b >> b++) / --c);
    }
}
