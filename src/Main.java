import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        int intNum = 1;
        float floatNum = 2.434f;
        double doubleNum = 3.83525235;
        String stringVar = "Hello";
        System.out.printf("int: = %d, float: = %f, double: = %.3f, String: = %s\n", intNum, floatNum, doubleNum, stringVar);
        String str = "Hello";
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        //My rifle is my best friend.
        userString = "My rifle is my best friend";
        System.out.printf("userString: = %s", userString);

        int stringLength = userString.length();
        System.out.print("\n___________________________\n");


        System.out.printf("stringLength: = %d\n___________________________\n", stringLength);


        boolean stringIsEmpty = userString.isEmpty();
        System.out.printf("stringIsEmpty: = %b\n___________________________\n", stringIsEmpty);


        char charNr12 = userString.charAt(12);
        System.out.printf("charNr12: = %c\n___________________________\n", charNr12);


        String anotherString = "Without me, my rifle is useless.";
        boolean stringsAreEqual = userString.equals(anotherString);
        System.out.printf("stringsAreEqual: = %b\n___________________________\n", stringsAreEqual);


        anotherString = "MY RIFLE IS MY BEST FRIEND.";
        boolean stringAreEqualCaseInsensitive = userString.equalsIgnoreCase(anotherString);
        System.out.printf("stringAreEqualCaseInsensitive: = %b\n___________________________\n"
                , stringAreEqualCaseInsensitive);


        boolean startsWithMy = userString.startsWith("My");
        boolean endsWithFriend = userString.endsWith("friend");
        boolean containBest = userString.contains("best");
        System.out.printf("startsWithMy: = %b\n___________________________\n", startsWithMy);
        System.out.printf("endsWithFriend: = %b\n___________________________\n", endsWithFriend);
        System.out.printf("containBest: = %b\n___________________________\n", containBest);


        String updatedStringReplacefF = userString.replace('f', 'F');
        System.out.printf("updatedStringReplacefF: = %s\n___________________________\n", updatedStringReplacefF);

        String stringDeleteBest = userString.replace("best", "");
        System.out.printf("stringDeleteBest: = %s\n___________________________\n", stringDeleteBest);

        String lowerCaseString = userString.toLowerCase();
        System.out.printf("lowerCaseString: = %s\n___________________________\n", lowerCaseString);

        String firstName = "Bobby";
        String lastName = "Robson";
        int age = 80;
        String infoAboutPerson = String.format("FirstName: %s\n" +
                "LastName: %s\nAge: %d\n", firstName, lastName, age);
        System.out.printf("//infoAboutPerson// \n%s\n___________________________\n", infoAboutPerson);

        StringBuffer mutableString = new StringBuffer("Hello,");
        mutableString.append("student!");
        mutableString.append(" Are you ready to learn Java?");
        System.out.printf("mutableString: %s\n___________________________\n", mutableString);
        System.out.println("Ok");


    }
}