package kontobsp;

public class Start
{
    public static void main(String[] args)
    {
        /*
        Konto konto= new Konto(123456789,"Karsten Kotz",0.19);
        Konto dispokonto=new Konto(987654321,"Sabine Spuck", 9, 500);
        konto.einzahlen(1.01);
        System.out.println(konto.getKontonummer()+"\n" + konto.getName() + "\n" + konto.getKontostand()+"\n");
        System.out.println(dispokonto.getKontonummer()+"\n" + dispokonto.getName()+"\n" + dispokonto.getKontostand()+"\n" + dispokonto.getDispositionskredit()+ "\n");
        dispokonto.auszahlen(512);*/

        Konto sender = new Konto(8765, "Frau Schmutz", 9876, 900);
        Konto empfaenger = new Konto(8766, "Frau Schutz", 96, 900);
        Bankhaus bankhaus = new Bankhaus(sender, empfaenger);
        System.out.println("Empfaenger Stand " + bankhaus.getEmpfeanger().getKontostand());
        System.out.println("Sender Stand " + bankhaus.getSender().getKontostand());
        bankhaus.ueberweisen(9);

        System.out.println("Empfaenger Stand Neu " + bankhaus.getEmpfeanger().getKontostand());
        System.out.println("Sender Stand Neu " + bankhaus.getSender().getKontostand());


    }
}