public class Battle {
    static public void start(Hero heroA, Hero heroB) {
        int round = 1;
        do {
            System.out.println("Ronda nº"+round);
            heroB.reciveDamage(heroA.attack());
            heroA.reciveDamage(heroB.attack());
            round++;
            System.out.println(heroA);
            System.out.println(heroB);
        } while (heroA.isAlive() && heroB.isAlive());

        if (!heroA.isAlive() && !heroB.isAlive()) {
            System.out.println("Ambos héroes han caido! Empate!");
        } else if (!heroA.isAlive()) {
            System.out.println(heroA.getName()+" ha caido, el vencedor es "+heroB.getName());
        } else {
            System.out.println(heroB.getName()+" ha caido, el vencedor es "+heroA.getName());
        }
    }
}
