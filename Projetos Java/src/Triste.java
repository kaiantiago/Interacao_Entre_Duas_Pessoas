public class Triste extends Pessoa{

    public Triste(String nome) {
        super(nome);
    }

    @Override
    public void responderOla(Pessoa outraPessoa) {
        System.out.println(this.getNome() + ": Olá, " + outraPessoa.getNome() + ". Meu nome é " + this.getNome() +
                ". Me sinto triste.");
    }
}
