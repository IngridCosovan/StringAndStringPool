package ro.java.ctrln;
 // are capacitatea de 16 caractere
// API-ul StringBuilder este foarte asemănător API-ului StringBuffer. De fapt, clasa StringBuilder a fost introdusă ca înlocuitor
//         pentru clasa StringBuffer (pentru aplicații cu un singur fir). Clasa StringBuilder aparține java. lang și este moștenit
//         de la java generică. lang. obiect. Este o clasă finală, deci programatorii nu o pot extinde. Clasa StringBuilder
//         implementează interfețe Serializable, Appendable și CharSequience. Un obiect al clasei StringBuilder poate conține o
//         secvență de caractere care poate fi mutabilă, dar nu este sigură în legătură cu firul. Aceasta înseamnă că este foarte
//         asemănător cu un obiect String, dar șirul poate fi modificat oricând.Dar clasa StringBuilder nu oferă sincronizare și,
//         prin urmare, este susținută a fi mai rapidă decât utilizarea clasei StringBuffer. Clasa StringBuilder oferă metode append
//         () și insert () cu funcții similare cu cele din clasa StringBuffer.
public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JAVA!Salut lume!");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.indexOf("Sa"));
        System.out.println(stringBuilder.replace(0, 4, "  Hello!"));
        System.out.println(stringBuilder.substring(0,7));
        System.out.println(stringBuilder.toString().trim());
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(10));
        System.out.println(stringBuilder.insert(5, "w"));
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.delete(5,6).delete(0,2));


    }
}
