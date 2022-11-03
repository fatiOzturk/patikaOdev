public class Fighter {
    String name;
    double damage;
    double health;
    int weight;
    double dodge;

    public Fighter(String name, double health, int weight, double dodge) {
        this.name = name;
        this.damage = Math.random() * 50;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public double hit(Fighter against) {
        System.out.println("------------");
        System.out.println(this.name + " => " + against.name + " " +  this.damage + " hasar vurdu.");

        if (against.dodge()) {
            System.out.println(against.name + " gelen hasarı savurdu.");
            return against.health;
        }

        if (against.health - this.damage < 0)
            return 0;

        return against.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
