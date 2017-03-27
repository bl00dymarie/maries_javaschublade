/*Strings sind Zeichenketten und in Java kein primitiver Datentyp,
- nein nein, nicht doch! - sondern Objekte.
String ist eine Klasse im Package.java.lang, wird automatisch importiert.
So werden Strings deklariert:
String s = "abc";
Neue Objekte erzeugt man mit new.
Typ variablenName = new Typ(parameter1, parameter2, ...);
Das:
String s = new String("abc");
ist das gleiche wie:
String s = "abc";
*/

class Strings
{
  public static void main(String[] args)
  {
    String s = "\"abc";
    System.out.println("This is the content of String s: "+s+" "+s);

    String s1 = new String("abc");
    String s2 = new String("ABC");

    /* Alle 3 String-Objekte s, s1 und s2 sind gleich,
    sie haben den gleichen Wert (nämlich "abc").
    Aber sie sind nicht dasselbe Objekt!

    Den Inhalt oder Wert zweier Objekte kann man
    nicht vergleichen wie primitive Variablen, also nicht mit ==.
    In den Variablen s1 und s2 ist nur eine Referenz
    (Pointer, Zeiger) auf das eigentliche Objekt gespeichert.
    Also in s1 und s2 steht jeweils die Adresse des Objekts im Arbeitsspeicher.
    An der Adresse liegt dann der eigentliche String.
    Also liegt an zwei verschiedenen Stellen im Arbeitsspeicher
    der String "abc" - die Adressen in s1 und s2 sind unterschiedlich.
    */

    if (s2 == s1)
    {
      System.out.println("Yes s1 & s2, they share the same place");
    }
    else
    {
      System.out.println("No, s2 & s1, they don't share the same place");
    }

    /* Die Methode equals ist in der Klasse String definiert.
    Sie erwartet einen Parameter. Sie gibt true oder false zurück,
    also einen boolean (Wahrheitswert). Eine (nicht-statische) Methode ruft man so auf:
    Variablenname.Methodenname(Parameter);
    Zwischen Variablenname und Methodenname steht also der Punktoperator.
    Um den oder die Parameter kommen runde Klammern.
    Mehrere würden mit Kommas getrennt werden.
    Hier ist der Variablenname s1, der Methodenname equals und der Parameter s2.
    (Man hätte an dieser Stelle natürlich genau so gut s2.equals(s1) verwenden können.)

    Man kann es auch so ausdrücken:
    An das Objekt s wird die Nachricht "equals" geschickt,
    ihm wird also gesagt, es soll einen Vergleich ausführen,
    seine equals-Methode aufrufen. Als Parameter wird s1 übergeben.
    */
    if (s2.equals(s1))
    {
      System.out.println("Yes s2 & s1, they share the same value");
    }
    else
    {
      System.out.println("No, s2 & s1, they don't share the same value");
    }
    boolean retVal;
    retVal = s1.equalsIgnoreCase(s2);
    System.out.println("Comparison ignoring the upper/lower case of content = " +retVal);
    /*
    Achte darauf, auch dann die runden Klammern
    hinter einen Methodenaufruf zu schreiben,
    wenn gar kein Parameter übergeben wird.
    Das ist zwingend notwendig,
    um sie von Variablen zu unterscheiden.
    */
    int i = s.length();
    char ch = s.charAt(0);
    System.out.println("This is the length of String 's': "+i);
    System.out.println("This is character at (0) from s: "+ch);
    String st = "abcdef";
    char c = st.charAt(2);
    System.out.println("Here is character at (2) from st: "+c);

    System.out.println("****************");
    System.out.println( "abc".replace('a', 'z') );
    System.out.println( "abcdef".startsWith("abc") );
    System.out.println( "abcdef".endsWith("def") );
    System.out.println( "Hallo Welt".toLowerCase() );
    System.out.println( "Hallo Welt".toUpperCase() );
    System.out.println( "Hallo Welt".substring(2, 5) );
    System.out.println( "Hallo Welt".indexOf('l') );
    System.out.println( "Hallo Welt".indexOf('l', 5) );
    //System.out.println( "Hallo Welt".indexOf('Wel') );
    System.out.println( "       Hallo   Welt    ".trim());
    System.out.println( "abc".compareTo("def"));
    System.out.println( "def".compareTo("abc"));
    System.out.println( "abc".compareTo("abc"));

  }
}

/*Methoden
.equals(x) => true/false
.equalsIgnoreCase(x) => true/false
.charAt(i)
.length(i)
.replace(x,y)
.startsWith(x) => true/false
.endsWith(x) => true/false
.toLowerCase(x)
.toUpperCase(x)
.substring(x,y) => cuts out the String from charAt x to charAt y
.indexOf(x)
.indexOf(i)
.trim()
.compareTo(x)
.compareTo()
*/
