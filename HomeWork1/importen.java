package HomeWork1;

public class importen {
    public static boolean isDebugMode = true;

    public static void main(String[] args) {
        checkStartDebugMode(args);
        int a = 42;
        int x = 15;

        if(a < 42){
            if(isDebugMode)
            a = 42;
        }
        System.out.println(a &= x);
        System.out.println(a | x);
       // System.out.println(Integer.toBinaryString(10));


    }
    public static void checkStartDebugMode(String[] arr){

        for (String arg : arr) {
            if("debug".equalsIgnoreCase(arg)){
                isDebugMode = true;
            }
        }
    }
}
