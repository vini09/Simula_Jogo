class Homem_Aranha extends Boneco {
        public Homem_Aranha(String nome, int vida, int dano) {
            super(nome, vida, dano);
        }

        public void atacar(Boneco p) {
            System.out.println(getNome() + " atacou " + p.getNome() + " com " + getDano() + " de dano!");
            p.setVida(p.getVida() - getDano());
        }
    }

