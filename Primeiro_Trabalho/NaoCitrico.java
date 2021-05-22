import java.util.*;

/**Classe para objetos do tipo NaoCitrico, contendo atributos, construtores e métodos para o mesmo
* @author Yuri De Lima Carvalho
*/

public class NaoCitrico extends Produto {

    private String estadoDeOrigem;
    private int cod;

    public NaoCitrico(String estadoDeOrigem, int cod) {
        super();
        this.estadoDeOrigem = estadoDeOrigem;
        this.cod = cod;
    }

    public NaoCitrico() {
        super();
        estadoDeOrigem = "Estado De Origem Nao definido";
        cod = 000;
    }

    public NaoCitrico(String nomeFruta, int calorias, double precoFruta, String estadoDeOrigem, int cod) {
        super(nomeFruta, calorias, precoFruta);
        this.estadoDeOrigem = estadoDeOrigem;
        this.cod = cod;
    }

    public NaoCitrico(String nomeFruta, String estadoDeOrigem, int cod) {
        super(nomeFruta);
        this.estadoDeOrigem = estadoDeOrigem;
        this.cod = cod;
    }

     /** 
     * Método para retornar o atributo privado estadoDeOrigem
     * @return String
     */

    public String getEstadoDeOrigem() {
        return this.estadoDeOrigem;
    }

     /** 
     * Método para modificar o atributo privado estadoDeOrigem
     * @param String
     */

    public void setEstadoDeOrigem(String estadoDeOrigem) {

        this.estadoDeOrigem = (estadoDeOrigem.matches("[a-zA-Z]+")) ? (this.estadoDeOrigem = estadoDeOrigem)
                : (this.estadoDeOrigem = "Estado De Origem nao definido!");

    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void lerDados(){
        Scanner sc = new Scanner(System.in);
        super.lerDados();
        System.out.println("Entre com o estado de origem da fruta: ");
        setEstadoDeOrigem(sc.nextLine());
        System.out.println("Entre com o codigo da fruta: ");
        setCod(sc.nextInt());

    }


    public void exibirDados(){
        super.exibirDados();
        System.out.printf("\nEstado de origem da fruta: %s", estadoDeOrigem);
        System.out.printf("\nCodigo da fruta: %d \n\n", cod);
    }

    public void calcAumentoPreco(){
        double auxP;
        auxP = getPrecoFruta();
        auxP *= 1.3f;
        setPrecoFruta(auxP);

    }

}
