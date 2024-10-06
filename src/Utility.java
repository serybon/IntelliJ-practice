public class Utility {

    public static String stringChanger(String myStr){

                return myStr + "!!!!!";
    }
    public static void changeFirstNumber(int[] array){
        array[0] = 999999;

    }

    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static int calculateNumbers(int a, int b){
        return a + b;
    }

    public static void sexChanger(HomoSapiense homo){
        homo.gender = "hermaphrodite";
    }

    public static void mindChanger(HomoSapiense homo){


    }
}
