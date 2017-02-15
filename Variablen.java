class Variablen
{
  public static void main(String[] args)
  {
    int i = 3; System.out.println(i);
    i = 5; System.out.println(i);

    int a = 17; int b = 3;
    int rest = a % b;
    int summe = a + b;
    int differenz = a - b;
    int produkt = a * b;
    int quotient = a / b;

    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("a+b = "+summe);
    System.out.println("a-b = "+differenz);
    System.out.println("a*b = "+produkt);
    System.out.println("a:b = "+quotient);
    System.out.println("Rest = "+rest);
  }
}

/*
Weitere Datentypen

ganze Zahlen
byte    1 Byte  ganze Zahlen      -2**7 bis 2**7-1
short   2 Byte  ganze Zahlen      -2**15 bis 2**15-1
int     4 Byte  ganze Zahlen      -2**31 bis 2**31-1
long    8 Byte  ganze Zahlen      -2**63 bis 2**63-1

Fließkommazahlen (Dezimalzahlen, gebrochene Zahlen)
float   4 Byte  Fließkommazahlen  mit einfacher Genauigkeit
double  8 Byte  Fließkommazahlen  mit doppelter Genauigkeit

Wahrheitswerte
boolean 1 Byte  Wahrheitswerte    true oder false

Zeichen
char    2 Byte  Zeichen           Unicode
(char steht für character oder im Dt. Zeichen)

Bsp:
    byte b = 5;
    short s = 400;
    int i = -17;
    long l = 100000000000L;
    float f = 0.123f;
    double d = 0.123;
    boolean w = true;
    boolean nw = false;
    char c = 'x';

*/
