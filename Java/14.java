public class Configuracao {


    private static Configuracao instancia;

    
    private String parametro1;
    private String parametro2;

    
    private Configuracao() {
       
        this.parametro1 = "Valor padrão 1";
        this.parametro2 = "Valor padrão 2";
    }

    
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

   
    public String getParametro1() {
        return parametro1;
    }

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }

    public String getParametro2() {
        return parametro2;
    }

    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
    }

    public static void main(String[] args) {

        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();


        config1.setParametro1("Novo valor 1");

       
        System.out.println(config1 == config2);  
        System.out.println(config2.getParametro1());  
    }
}
