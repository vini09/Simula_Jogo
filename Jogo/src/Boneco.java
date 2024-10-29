 import java.util.Random;

    abstract class Boneco implements Ataque {
        private String nome;
        private int vida;
        private int dano;

        public Boneco(String nome, int vida, int dano) {
            this.nome = nome;
            this.dano = dano;
            this.vida = vida;
        }

        public int getVida() {
            return vida;
        }
        public void setVida(int vida) {
            this.vida = Math.max(vida, 0);
        }
        public int getDano() {
            return dano;
        }
        public String getNome() {
            return nome;
        }

        public abstract void atacar(Boneco p);

        public void curar() {
            Random rand = new Random();
            int cura = rand.nextInt(8) + 1;
            setVida(getVida() + cura);
            System.out.println(nome + " se regenerou em " + vida + " ganho de vida!");
        }
    }

