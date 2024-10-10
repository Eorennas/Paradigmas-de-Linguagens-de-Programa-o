public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade; 

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }


    public String detalhes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }


    public String acelerar(int incremento) {
        if (incremento < 0) {
            return "O valor de incremento deve ser positivo.";
        }
        this.velocidade += incremento;
        return marca + " " + modelo + " acelerou. Velocidade atual: " + velocidade + " km/h";
    }


    public String frear(int decremento) {
        if (decremento < 0) {
            return "O valor de decremento deve ser positivo.";
        }
        this.velocidade = Math.max(0, velocidade - decremento);
        return marca + " " + modelo + " freou. Velocidade atual: " + velocidade + " km/h";
    }


    public int getVelocidade() {
        return this.velocidade;
    }

 
    public String exibirVelocidade() {
        return "Velocidade atual do " + marca + " " + modelo + ": " + velocidade + " km/h";
    }


    public static void main(String[] args) {
        Carro carroTeste = new Carro("Toyota", "Corolla", 2020);

        System.out.println(carroTeste.acelerar(50));
        System.out.println(carroTeste.frear(20));
        System.out.println(carroTeste.exibirVelocidade());
    }
}
