package ro.java.ctrln;

public class StringBuilderUsageOperations {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JAVA!Salut lume!");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.indexOf("Sa"));
        System.out.println(stringBuilder.replace(0, 4, "  Hello!"));
        System.out.println(stringBuilder.substring(0, 7));
        System.out.println(stringBuilder.toString().trim());
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(10));
        System.out.println(stringBuilder.insert(5, 'w'));
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.delete(5, 6).delete(0, 2));

    }
}

