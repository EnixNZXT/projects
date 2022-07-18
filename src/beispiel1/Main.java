package beispiel1;

public class Main
{
    public static void  main(String[] args){
        Anhaenger anhaenger = new Anhaenger("Tandem", 1234, 750);
        anhaenger.setBezeichnung("Tandem");
        anhaenger.setNummer(4711);

        System.out.println("Anhängerbezeichnung " + anhaenger.getBezeichnung());
        System.out.println(anhaenger.pruefeNutzlast(850));
    }
}
