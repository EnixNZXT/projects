package kontobsp;

public class Bankhaus {
    public Konto sender;
    public Konto empfeanger;

    public Bankhaus(Konto sender, Konto empfeanger)
    {
    this.sender=sender;
    this.empfeanger=empfeanger;
    }

    public Konto getSender()
    {
        return sender;
    }

    public Konto getEmpfeanger()
    {
        return empfeanger;
    }

    public void setSender(Konto sender)
    {
        this.sender = sender;
    }

    public void setEmpfeanger(Konto empfeanger)
    {
        this.empfeanger = empfeanger;
    }

    public void ueberweisen(double summe) {
        if (sender.getKontostand() + sender.getDispositionskredit() >= summe) {
            sender.setKontostand(sender.getKontostand() - summe);
            empfeanger.setKontostand(empfeanger.getKontostand() + summe);
        } else {
            System.out.println("Nix möglich du bist zu arm");
        }
    }
}

