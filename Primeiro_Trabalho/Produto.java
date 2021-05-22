import java.util.*;

/**Classe para objetos do tipo Produto, contendo atributos, construtores e métodos para o mesmo
* @author Yuri De Lima Carvalho
*/

public class Produto {

    /** Atributos privados da classe Produto */
    private String nomeFruta;
    private int calorias;
    private double precoFruta;

    public Produto(String nomeFruta, int calorias, double precoFruta) {
        this.nomeFruta = nomeFruta;
        this.calorias = calorias;
        this.precoFruta = precoFruta;
    }

    public Produto() {
        this.nomeFruta = "Nome nao inserido!";
        this.calorias = 180;
        this.precoFruta = 1.00f;
    }

    public Produto(String nomeFruta, int calorias) {
        this(nomeFruta, calorias, 1.00f);
    }

    public Produto(String nomeFruta, double precoFruta) {
        this(nomeFruta, 180, precoFruta);
    }

    public Produto(int calorias) {
        this("Nome nao definido", calorias, 1.00f);
    }

    public Produto(double precoFruta) {
        this("Nome nao definido", 180, precoFruta);
    }

    public Produto(int calorias, double precoFruta) {
        this("Nome nao definido", calorias, precoFruta);
    }

    public Produto(String nomeFruta) {
        this(nomeFruta, 180, 1.00f);
    }

    /**
     * Método para retornar o atributo privado nomeFruta
     * 
     * @return String - nomeFruta
     */

    public String getNomeFruta() {
        return this.nomeFruta;
    }

    /**
     * Método para retornar o atributo privado calorias
     * 
     * @return int calorias
     */

    public int getCalorias() {
        return this.calorias;
    }

    /**
     * Método para retornar o atributo privado precoFruta
     * 
     * @return String - precoFruta
     */

    public double getPrecoFruta() {
        return this.precoFruta;
    }

    /**
     * Método para modificar o atrivuto nomeFruta, não permitindo números,
     * Caso existam números na String digitada, é atribuído "Nome Não Definido!"
     * 
     * @param String - nomeFruta
     */
    public void setNomeFruta(String nomeFruta) {
        try {
            if (nomeFruta.matches("[a-zA-Z ]+")) {
                this.nomeFruta = nomeFruta;
            } else {
                this.nomeFruta = "Nome Nao Definido!";
            }

        } catch (NumberFormatException e) {
            this.nomeFruta = "Nome Nao Definido";
        }

    }

    /**
     * Método para modificar o atributo calorias, não aceitando valores negativos,
     * 
     * @param int - calorias
     */

    public void setCalorias(int calorias) {

        this.calorias = (calorias < 0) ? (this.calorias = 0) : (this.calorias = calorias);

    }

    /**
     * Método para modificar o atributo precoFruta, não aceitando valores negativos e
     * menores que R$1,00.
     * 
     * @param double - precoFruta
     */

    public void setPrecoFruta(double precoFruta) {
        if (precoFruta < 0 || precoFruta < 1.00f) {
            this.precoFruta = 0;
        } else {
            this.precoFruta = precoFruta;
        }

    }

    /**
     * Método para exibição de dados.
     */

    public void exibirDados() {
        System.out.printf("Nome da fruta: %s", nomeFruta);
        System.out.printf("\nCalorias da fruta: %d", calorias);
        System.out.printf("\nPreco da fruta: %.2f", precoFruta);
    }

     /**
     * Método para leitura de dados.
     */

    public void lerDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome da fruta: ");
        setNomeFruta(sc.nextLine());

        System.out.println("Entre com as calorias da fruta: ");
        setCalorias(sc.nextInt());
        System.out.println("Entre com o preco da fruta: ");
        setPrecoFruta(sc.nextDouble());

    }

     /**
     * Método para reajuste no valor do preço.
     */
    public void calcAumentoPreco() {
        precoFruta *= 1.1f;
    }

}
