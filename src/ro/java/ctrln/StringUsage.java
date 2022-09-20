package ro.java.ctrln;
//În Java, clasa String este prevăzută să dețină o secvență de caractere care nu pot fi modificate (odată inițializate). Alternativ,
//        limbajul de programare Java oferă două tipuri de secvențe de caractere mutabile. Adică, atunci când programatorii trebuie
//        să modifice un anumit String (după inițializare), trebuie să folosească clasa StringBuffer sau clasa StringBuilder,
//        în locul clasei String.
import java.nio.charset.StandardCharsets;

public class StringUsage {

    public static void main(String[] args) {
        String stringOne = "This is Java!"; //acesta este un string literal, declaram un obiect nou de tipul string folosind string literal, astea sunt in String Pool
        String stringTwo = "This is Java!"; //acesta este tot un string literal //in string pool se afla
        String stringThree = new String("This is Java!");//acest obiect este tinut pe heap nu in string pool
        String stringFour = new String (stringOne);

        System.out.println("stringOne.equals(stringTwo): " + stringOne.equals(stringTwo));
        System.out.println("stringOne == stringTwo: " + (stringOne == stringTwo)); //==pe obiecte inseamana daca refera acelasi obiect
       System.out.println("stringOne == stringTwo: " + stringOne == stringTwo);

        System.out.println("stringOne.equals(stringThree): " + stringOne.equals(stringThree));
        System.out.println("stringOne == stringThree: " + (stringOne == stringThree));

        System.out.println("stringOne.equals(stringFour): " + stringOne.equals(stringFour));
        System.out.println("stringOne == stringFour: " + (stringOne == stringFour));

        String stringFive = new String(stringOne.getBytes());
        System.out.println("stringOne.equals(stringFive): " + stringOne.equals(stringFive));
        System.out.println("stringOne == stringFive " + stringOne == stringFive);

        String stringSix = "JAVA"; //acest string literal este internalizat pe string pool
        char[] chars = {'J', 'A', 'V', 'A'};
        String stringSeven = new String(chars); //acest string este tinut pe heap
        System.out.println("stringSix.equals(stringSeven): " + stringSix.equals(stringSeven));
        System.out.println("stringSix == stringSeven: " + (stringSix == stringSeven));

        StringBuilder stringBuilder = new StringBuilder("JAVA");
        System.out.println("stringSix.equals(stringBuilder) " + stringSix.equals(stringBuilder));
        System.out.println("stringSix.equals(stringBuilder.toString()) " + stringSix.equals(stringBuilder.toString()));
        //System.out.println(stringSix == stringBuilder); //acest lucru nu este permis pentru ca testam un obiect de tipul String si un obiect de tipul StringBuilder

    }
}

