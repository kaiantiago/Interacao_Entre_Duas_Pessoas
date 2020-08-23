public class JavaSample {
    public static void main(String[] args){
        Pessoa michele = new Feliz("Michele");
        Pessoa luciana = new Triste("Luciana");
        michele.dizerOla(luciana);
        System.out.println("");
        luciana.responderOla(michele);
    }
}
