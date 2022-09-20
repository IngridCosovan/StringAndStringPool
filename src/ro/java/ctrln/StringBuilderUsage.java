package ro.java.ctrln;
 // are capacitatea de 16 caractere
public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.toString());
        stringBuilder.append("JAVA!");
        System.out.println(stringBuilder);
        stringBuilder.append("Salut lume!");
        System.out.println(stringBuilder);
    }
}
