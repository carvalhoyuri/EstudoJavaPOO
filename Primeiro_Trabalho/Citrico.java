import java.util.Scanner;

/**Classe para objetos do tipo Citrico, contendo atributos, construtores e métodos para o mesmo
* @author Yuri De Lima Carvalho
*/

public class Citrico extends Produto {

    private int acidoCitrico;
    private double gramas;

    public Citrico(int acidoCitrico, double gramas) {
        super();
        this.acidoCitrico = acidoCitrico;
        this.gramas = gramas;
    }

    public Citrico() {
        super();
        acidoCitrico = 0;
        gramas = 0.0f;
    }

    public Citrico(String nomeFruta, int calorias, double precoFruta, int acidoCitrico, double gramas){
        super(nomeFruta,calorias,precoFruta);
        this.acidoCitrico = acidoCitrico;
        this.gramas = gramas;
    }

    public Citrico(String nomeFruta, int acidoCitrico, double gramas){
        super(nomeFruta);
        this.acidoCitrico = acidoCitrico;
        this.gramas = gramas;
    }
    
    public Citrico(String nomeFruta, double gramas){
        super(nomeFruta);
        this.gramas = gramas;
        
    }

    
    /** 
     * Método para retornar o atributo privado acidoCitrico
     * @return int
     */
    public int getAcidoCitrico() {
        return this.acidoCitrico;
    }

    
    /** Método para modificar o atributo acidoCitrico, não permitindo valores negativos. 
     * @param acidoCitrico
     */
    public void setAcidoCitrico(int acidoCitrico) {
        this.acidoCitrico = (acidoCitrico < 0) ? (this.acidoCitrico = 0) : (this.acidoCitrico = acidoCitrico);
    }

    
    /** Método para retornar o atributo privado gramas
     * @return double
     */
    public double getgramas() {
        return this.gramas;
    }

    
    /** Método para modificar o atributo gramas, não permitindo valores negativos.
     * @param gramas
     */
    public void setgramas(double gramas) {
        this.gramas = (gramas < 0) ? (this.gramas = 0) : (this.gramas = gramas);
    }

    /*
    Método para leitura de dados
    */
    public void lerDados(){
        Scanner sc = new Scanner(System.in);
        super.lerDados();
        System.out.println("Entre com o valor de acido citrico da fruta: ");
        setAcidoCitrico(sc.nextInt());
        System.out.println("Entre com o valor de gramas da fruta: ");
        setgramas(sc.nextDouble());

    }

     /*
    Método para exibição de dados
    */
    public void exibirDados(){
        super.exibirDados();
        System.out.printf("\nAcido citrico presente na fruta: %s", acidoCitrico);
        System.out.printf("\nGramas da fruta: %.2f \n\n", gramas);
    }

    /**
     * Método para reajuste no valor do preço.
     */

    public void calcAumentoPreco(){
        double auxP;
        auxP = getPrecoFruta();
        auxP *= 1.2f;
        setPrecoFruta(auxP);

    }

    

}
