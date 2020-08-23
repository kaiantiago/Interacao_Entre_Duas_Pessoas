public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void dizerOla(Pessoa outraPessoa){
        System.out.println(this.nome + ": Olá, " + outraPessoa.getNome());
    }

    public void responderOla(Pessoa outraPessoa) {
        System.out.println(this.nome + ": Olá, " + outraPessoa.getNome());
    }

}
