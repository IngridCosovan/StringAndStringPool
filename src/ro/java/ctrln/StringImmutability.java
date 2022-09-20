package ro.java.ctrln;

public class StringImmutability {
    public static void main(String[] args) {
        //String-uri imutabile, adica nu le mai poti schimba valoarea, si nu conteaza daca sunt definite ca string literal sau ca si constructor

        String stringOne = "wxyz";
        String stringTwo = new String("wxyz");
        stringOne.toUpperCase();
        stringTwo.toUpperCase();
        System.out.println(stringOne);
        System.out.println(stringTwo);

        //Sa pot afisa pot salva rezultatul in variabile noi SAU afisez corect rezultatul operatiunii

        String stringThree = stringOne.toUpperCase();
        String stringFour = stringTwo.toUpperCase();
        System.out.println(stringThree);
        System.out.println(stringFour);
        System.out.println(stringOne.toUpperCase());
        System.out.println(stringTwo.toUpperCase());

        String stringFive = "   1234  ";
        stringFive.trim();
        System.out.println(stringFive);
        System.out.println(stringFive.trim());

        stringOne = "This is JAVA Language!";
        System.out.println(stringOne.substring(2));
        System.out.println(stringOne.substring(5, 9));
        System.out.println(stringOne.replace('i', 'z'));
        System.out.println(stringOne.replace("is", "as"));
        System.out.println(stringOne.charAt(9));
        System.out.println(stringOne.concat(stringTwo));
        System.out.println(stringOne);
        System.out.println(stringOne.indexOf('a'));
        System.out.println(stringOne.length());
        System.out.println(stringOne.startsWith("Th"));
        System.out.println(stringOne.endsWith("!"));
        System.out.println(stringOne.endsWith("?"));

    }
}
