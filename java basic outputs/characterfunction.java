import jdk.tools.jlink.internal.plugins.StripJavaDebugAttributesPlugin;
// WAP to illustrate the character functions
class characterfunction
{
    public static void main(String args[])
    {
        System.out.println(Character.isLetter('7'));
        System.out.println(Character.isDigit('7'));
        System.out.println(Character.isUpperCase('S'));
        System.out.println(Character.isUpperCase('h'));
        System.out.println(Character.isLowerCase('s'));
        System.out.println(Character.toLowerCase('P'));
        System.out.println(Character.toUpperCase('g'));
        String s= "United Group Of Institution";
        System.out.println(s.length());
        System.out.println(s.charAt(10));
        System.out.println(s.indexOf('b'));
        String s1="Computer";
        System.out.println(s1.substring(4));
        String s2="COMPUTER SCIENCE";
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.replace('E', 'A'));
        String a="Computer";
        String b="Science";
        System.out.println(a.concat(b));
        String a1="        United     Group        of         Institutions         ";
        System.out.println(a1.trim());
        s= "Arun Kumar Singh";
        System.out.println(s.endsWith("Singh"));
        System.out.println(s.startsWith("Arun"));
        a="Bye";
        b="BYE";
        System.out.println(a.equalsIgnoreCase(b));
    }
}