class Konstanze
{
  public static void main(String[] args)
  {
    final int MAX_SCHUELERINNEN_PRO_KLASSE = 30;
    System.out.println("In jeder Klasse dürfen maximal " + MAX_SCHUELERINNEN_PRO_KLASSE + " Schuelerinnen sein.");
    //MAX_SCHUELERINNEN_PRO_KLASSE = 33; sollte eine Fehlermeldung verursachen
  }
}

/*alle Konstanten sollten durch final Variablen gesetzt werden,
das ist besonders wichtig, wenn sie an verschiedenen Stellen
im Quelltext vorkommen */
