public class Feliz extends Pessoa {

    public Feliz(String nome) {
        super(nome);
    }

    @Override
    public void dizerOla(Pessoa outraPessoa) {
        System.out.println(this.getNome() + ": Olá, " + outraPessoa.getNome() + ". Meu nome é " + this.getNome() +
                ". Me sinto feliz!");
    }
}
