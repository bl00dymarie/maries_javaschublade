/*Vergleiche und Bedingungen
if (Bedingungen)
{
  Anweisungen
}
else
{
  Anweisungen, wenn die Bedingung nicht erfüllt ist
}

int a = 1;
if (a<3)
{
  System.out.println("a ist kleiner als 3");
}*/

class Ifelse
{
  public static void main(String[] args)
  {
    int alter = 16;
    if (alter >= 18)
    {
      System.out.println("Hier ist dein Whisky Sour!");
    }
    else if (alter>=16)
      {
        System.out.println("Ein Wein darf's sein.");
      }
      else
      {
        System.out.println("Zu jung, hier hast du eine Rhabarberschorle, hmm!");
      }
    }
}
