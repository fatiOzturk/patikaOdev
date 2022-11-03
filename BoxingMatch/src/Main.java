public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Messi",100,95,50);
        Fighter alex = new Fighter("Ronaldo",100,100,50);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
