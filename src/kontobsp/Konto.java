package kontobsp;

public class Konto {
    private int kontonummer;
    private String name;
    private double kontostand;
    private double dispositionskredit;

    public Konto(int kontonummer, String name, double kontostand) {
        this.kontonummer = kontonummer;
        this.name = name;
        this.kontostand = kontostand;
    }

    public Konto(int kontonummer, String name, double kontostand, double dispositionskredit)
    {
        this.kontonummer=kontonummer;
        this.name=name;
        this.kontostand=kontostand;
        this.dispositionskredit=dispositionskredit;
    }
    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKontostand(double kontostand)
    {
        this.kontostand = kontostand;
    }

    public void setDispositionskredit(double dispositionskredit)
    {
        this.dispositionskredit = dispositionskredit;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public String getName() {
        return name;
    }

    public double getKontostand() {
        return kontostand;
    }

    public double getDispositionskredit() {
        return dispositionskredit;
    }

    public void einzahlen(double add) {
        this.kontostand += add;
    }

    public void auszahlen(double sub) {
        if (this.kontostand + this.dispositionskredit >= sub) {
            this.kontostand -= sub;
        } else {
            System.out.println("reicht nicht, der Betrag von: " + sub +" " + "kann nicht ausgezahlt werden");
        }
    }

    public void reset() {
        setKontostand(0.0d);
        setKontonummer(0);
        setName(null);
    }
}
