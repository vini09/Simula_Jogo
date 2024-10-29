import java.util.Random;
class Duende_Verde extends Boneco {
    public Duende_Verde(String nome, int vida, int dano) {
        super(nome, vida, dano);
    }

    public void atacar(Boneco p) {
        Random rand = new Random();
        int dano = rand.nextInt(getDano()) + 1;
        System.out.println(getNome() + " ataca " + p.getNome() + " causando " + dano + " de destruicao!");
        p.setVida(p.getVida() - dano);
    }
}
