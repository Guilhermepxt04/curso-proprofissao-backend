package teste_poo;

public class Caneta {

    /*---------------------------- Definiçâo de atributos -------------------------*/

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    /* ---------------------------- Construtor -----------------------------------*/

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public Caneta() {
    }

    public boolean getTampada() {
        return tampada;
    }

    public int getCarga() {
        return carga;
    }

    /*---------------------------- Definiçâo dos metodos -------------------------*/

    public void tampar () {
        tampada = true;
    }

    public void destampar () {
        tampada = false;
    }

    public void rabiscar() {
        if (carga > 0) {
            destampar();
            System.out.println("Rabisquei tudo");
            carga -= 10;
        } else {
            System.out.println("Sem carga na caneta");
        }
        tampar();
    }

    @Override
    public String toString() {
        return "Essa caneta tem o modelo " + modelo
                + ", da cor " + cor
                + ", ponta de tamanho " + ponta
                + ", a carga está em " + carga + "%"
                + ". Está tampada?: " + tampada;
    }
}
