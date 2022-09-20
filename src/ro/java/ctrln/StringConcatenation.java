package ro.java.ctrln;

public class StringConcatenation {
    public static void main(String[] args) {
        String stringOne = "This is";
        String stringTwo = "JAVA!";
        String stringThree = stringOne + " " + stringTwo;
        System.out.println(stringThree);

        String stringFour = stringThree + 2;
        System.out.println(stringFour);

        String stringFive = 2 + stringThree;
        System.out.println(stringFive);

        String stringSix = stringThree + false; //false este transformat in string-ul false si concatenat
        System.out.println(stringSix);

        String stringSeven = stringThree + null; //null este transformat in string-ul false si concatenat
        System.out.println(stringSeven);

        String stringEight = stringThree + "null";
        System.out.println(stringEight);

       // String stringNine = true + 1; //nu se poate
        String stringNine = "" + true + 1; //doar cu empty string, care forteaza transormarile lui true si 1 in string
        System.out.println(stringNine);

        String stringTen = "JAVA!";
        stringTen += 1;
        stringTen = stringTen + 1;
        System.out.println(stringTen);
    }
}
