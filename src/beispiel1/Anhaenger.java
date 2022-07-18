package beispiel1;

public class Anhaenger
{
    private String bezeichnung;
    private int nummer;
    private int nutzlast;

    public Anhaenger(String bezeichnung, int nummer, int nutzlast)
    {
        this.bezeichnung = bezeichnung;
        this.nummer = nummer;
        this.nutzlast = nutzlast;
    }
     public boolean pruefeNutzlast(int gewichtDerLadung)
     {
         if (gewichtDerLadung > nutzlast)
         {
             return false;
         }
         else
         {
             return true;
         }
     }

     public void setBezeichnung(String bezeichnung)
     {
         this.bezeichnung= bezeichnung;
     }

    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }

    public int getNummer()
    {
        return nummer;
    }
    public int getNutzlast()
    {
        return nutzlast;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }
}
