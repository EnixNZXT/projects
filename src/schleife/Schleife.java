package schleife;



public class Schleife {
    public static void main(String[] args) {
        String y;
        Integer x;
        y=args[0];
        x = Integer.parseInt(y);
        for (int count=0 ; count < x; count+=2){
        System.out.println(count);
        }
    }
}
