class Vergleiche
{
  public static void main(String[] args)
  {
    int i1 = 7;
    int i2 = 2;
    double di = (double) i2;
    System.out.println(di);
    double d = i1/di; //Integer Division ergibt 3, und nicht 3.5
    if (d == 3)
    {
      System.out.println("Es kommt 3 heraus");
    }
    else
    {
      System.out.println("Es kommt nicht 3 heraus");
    }
//********************************************************
    int i = 4;
    if (i != 2)
    {
      System.out.println("i ist nicht 2");
    }
    else
    {
      System.out.println("i ist gleich 2");
    }
//********************************************************
    int a = 2;
    if (a < 8)
    {
      System.out.println("a ist kleiner als 8");
    }
    else
    {
      System.out.println("a ist größer oder gleich 8");
    }
//********************************************************
    int zahl = 12;
    if (zahl > 6 && zahl < 18)
    {
      System.out.println("Die Zahl liegt zwischen 6 und 18");
    }
//********************************************************
    int zzahl = 15;
    if (zzahl % 2 == 0 || zzahl % 5 == 0)
    {
      System.out.println("Die Zahl kann durch 2 oder durch 5 geteilt werden.");
    }
    else
    {
      System.out.println("Die Zahl kann weder durch 2 noch durch 5 geteilt werden.");
    }
  }
}
