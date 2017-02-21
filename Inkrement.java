class Inkrement
{
  public static void main(String[] args)
  {
    int a = 3;
    System.out.println("Result of line 5 is: " +a);
    a++;
    System.out.println("Result of line 7 is: " +a);
    ++a;
    System.out.println("Result of line 9 is: " +a);
    int b = 0;
    b = a++;
    System.out.println("Result of line 12 what a is: " +a);
    System.out.println("Result of line 12 what b is: " +b);
    b = ++a;
    System.out.println("Result of line 15 what a is: " +a);
    System.out.println("Result of line 15 what b is: " +b);

  }
}

/* Besonders häufig ist das Erhöhen oder Vermindern um 1,
dafür gibt es extra Notationen.

Statt a = a + 1; kann man nicht nur a += 1;
sondern auch a++ oder ++a schreiben.
Das heißt Post- bzw. Präinkrement (inkrementieren = um 1 erhöhen).

Statt a = a - 1; kann man nicht nur a-= 1;
sondern auch a-- oder --a schreiben.
Das heißt Post- bzw. Prädekrement (dekrementieren = um 1 vermindern).

Wenn a++ oder ++a allein in einer Anweisung steht,
macht es keinen Unterschied, ob das ++ vorn oder hinten steht,
siehe Zeilen 12 und 15.
*/
