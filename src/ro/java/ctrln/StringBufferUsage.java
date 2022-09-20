package ro.java.ctrln;

public class StringBufferUsage {
    public static void main(String[] args) {
         StringBuffer stringBuffer = new StringBuffer(); //are capacitatea de 16 caractere
        StringBuffer  stringBuffer1 = new StringBuffer("123");
        StringBuffer stringBuffer2 = new StringBuffer(1234);
        CharSequence charSequence = "Invat limbajul Java!";
        StringBuffer stringBuffer3 = new StringBuffer(charSequence);
        stringBuffer.append(1);
        stringBuffer.append("2");
        stringBuffer.append(true);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer3);

        //se poate folosi pe aplicatii pe mai multe thread-uri
    }
}
