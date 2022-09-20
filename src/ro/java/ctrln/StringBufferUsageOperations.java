package ro.java.ctrln;

public class StringBufferUsageOperations {
    public static void main(String[] args) {
        CharSequence charSequence = "Invat limbajul Java";
        StringBuffer stringBuffer = new StringBuffer(charSequence);

        System.out.println(stringBuffer.append("!"));
        System.out.println(stringBuffer.indexOf("Java"));
        System.out.println(stringBuffer.insert(15, "Oracle "));
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(18));
        System.out.println(stringBuffer.delete(15, 22));
        System.out.println(stringBuffer.substring(15));
        System.out.println(stringBuffer.replace(15, stringBuffer.length(), "!"));
        System.out.println(stringBuffer);

    }
}
