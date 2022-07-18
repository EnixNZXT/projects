package nimmspiel;



import java.util.Scanner;

public class Nimm {
    public static void main(String[] args) {

        int inputPlayer;
        int npc;
        Scanner scanInput = new Scanner(System.in);
        int coins= (int) (Math.random()*(30-15))+15;

        System.out.println("Im Spiel sind:\n"+coins+" "+"Muenzen" );
        do {
            System.out.println("wie viel moechtest du ziehen?");
            while(true)
            {
             inputPlayer =scanInput.nextInt();
             if(inputPlayer<=3 && inputPlayer >=  1 )
                 break;
             System.out.println("Du kannst nur 1-3 Muenzen ziehen.");
            }
            coins -=inputPlayer;
            //System.out.println(coins);
            if(coins <= 0)
            {
                System.out.println("Das Spiel ist beendet.\n Du hast gewonnen!");
                break;
            }
             npc=(int) (Math.random()*(4-1))+1;
            coins-=npc;
            System.out.println("Der Computer hat \n"+npc+" "+"Muenzen gezogen");

            if(coins <= 0)
            {
                System.out.println("Das Spiel ist beendet.\n Du hast verloren!");
                break;
            }

            System.out.println("Es sind noch "+coins+" im Spiel");

        } while (coins>0);

    }
}
