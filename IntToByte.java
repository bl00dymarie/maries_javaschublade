class IntToByte
{
  public static void main(String[] args)
  {
    //problemlose Zuweisung an einen "höheren"/"weiteren" Typ machen
    short s = 4300;
    int i = s;

    /*Umgekehrtes Umwandeln funktioniert nur "explizit",
    -> genannt "casten"
    Man wandelt etwas also in einen anderen Typ um,
    indem man den Typ davor in runden Klammern schreibt.*/
    int it = 500;
    short sh = (short) it;

    //explizite Umwandlung eines int in einen byte Datentyp
    int in = 500;
    byte b = (byte) in;
    System.out.println(in);
    System.out.println(b);
    /*Das funktioniert auch, aber das Ergebnis ist nicht richtig.
    byte geht nur bis 127, also fließt die 500 über (Overflow),
    es gibt einen Genauigkeitsverlust (loss of precision).
    500-127=373 sind immer noch zu viel, die fangen jetzt wieder von unten,
    also von -128 an zu zählen. Das ist auch noch zu viel,
    255 weitere Zählschritte später ist Schluss, es sind noch 373-255=116 übrig.
    Die beginnen wieder von unten von -128 an zu zählen, -128+116=-12,
    also wird in b -12 gespeichert. Probier es aus! Es wird -12 ausgegeben.

    Es ist nicht möglich, booleans (Wahrheitswerte) in andere Typen
    oder andere Typen in booleans umzuwandeln.*/

    //Man kann auch zwischen char und int durch Casten umwandeln
    char c = (char) 97;
    System.out.println(c);
    /*es wird ein 'a' ausgegeben, denn 97 ist die ASCII- und
    Unicode-Nummer des kleinen a.
    Die Umwandlung von char zu int funktioniert analog:*/
    int a = (int) 'A';
    System.out.println(a);

    /*Wenn also bei der Division von zwei int-Zahlen immer eine int-Zahl herauskommt,
    müssen wir einfach mindestens eine der beiden Zahlen zu double konvertieren: */
    double d = 7.0/2; //oder double d = 7/2.0 oder double d = 7.0/2.0
    System.out.println(d);

    int zahl1 = 7;
    int zahl2 = 2;
    double db = (double) zahl1/zahl2;
    System.out.println(db);

    System.out.println(a += b);

  }
}
