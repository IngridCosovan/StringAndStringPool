package ro.java.ctrln;

import javax.sound.midi.Soundbank;

//se poate folosi pe aplicatii pe mai multe thread-uri
//Clasa StringBuffer a fost introdusă în JDK 1. 0. Clasa StringBuffer aparține java. lang și este moștenit de la java generică.
//        lang. obiect. Programatorii nu-l pot extinde mai departe, deoarece este o clasă finală. Clasa StringBuffer implementează
//        interfețe Serializable, Appendable și CharSequience. Un obiect al clasei StringBuffer poate conține o secvență de caractere
//        care poate fi mutabilă și protejată de fir. Asta inseamna ca este foarte asemanator cu un obiect String, dar secventa de caractere
//        (lungime si continut) poate fi modificata in orice moment dupa initializarea obiectului StringBuffer. Totuși, aceasta ar trebui făcută
//        folosind metodele specifice furnizate de clasa StringBuffer. Există două operații principale în clasa StringBuffer.
//        Acestea sunt furnizate de metodele append () și insert (). Aceste metode sunt supraîncărcate, astfel încât sunt capabile să
//        accepte date de orice tip, cum ar fi întreg și lung. Ambele metode transformă în prealabil orice intrare într-un șir și apoi adaugă
//        (adaugă sau inserează) caracterele șirului corespunzător obiectului Stribbuffer existent. Metoda append () adaugă șirul convertit
//        la sfârșitul obiectului StringBuffer existent, în timp ce metoda insert () va adăuga caracterele de intrare la punctul de inserare specificat.
public class StringBufferUsage {
    public static void main(String[] args) {
//         StringBuffer stringBuffer = new StringBuffer(); //are capacitatea de 16 caractere
//        StringBuffer  stringBuffer1 = new StringBuffer("123");
//        StringBuffer stringBuffer2 = new StringBuffer(1234);
        CharSequence charSequence = "Invat limbajul Java";
        StringBuffer stringBuffer = new StringBuffer(charSequence);
//        stringBuffer.append(1);
//        stringBuffer.append("2");
//        stringBuffer.append(true);
//        System.out.println(stringBuffer);
//        System.out.println(stringBuffer1);
//        System.out.println(stringBuffer2);
//        System.out.println(stringBuffer3);
        System.out.println(stringBuffer.append("!"));
        System.out.println(stringBuffer.indexOf("Java"));
        System.out.println(stringBuffer.insert(15,"Oracle"));
        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.charAt(100));//cometam pentru ca aceatsa linie da o exceptie si atuci aplicatia nu mai ruleaza in continuare
        System.out.println(stringBuffer.delete(15,22));
        System.out.println(stringBuffer.substring(15));
        System.out.println(stringBuffer.replace(15, stringBuffer.length(), "!"));

    }
}
