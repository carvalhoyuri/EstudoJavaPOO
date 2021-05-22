import java.util.*;

public class Feira {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt, numFruta,numPreco;

        Produto carrinho[] = new Produto[5];

        carrinho[0] = new Citrico();
        carrinho[1] = new Citrico("Limao", 70, 100.00f);
        carrinho[2] = new Citrico("Laranja", 130.00f);
        carrinho[3] = new NaoCitrico();
        carrinho[4] = new NaoCitrico("Banana", "Rio De Janeiro", 999);

        do {
            System.out.println("\tMenu\n");
            System.out.println("Escolha abaixo qual opcao desejada:\n");
            System.out.println("1 - Preencher Frutas");
            System.out.println("2 - Exibir Dados Das Frutas");
            System.out.println("3 - Ordenar Frutas - Ordem decrescente");
            System.out.println("4 - Alterar dados de uma das frutas");
            System.out.println("5 - Aumento do preco");
            System.out.println("0 - Sair do Menu");
            System.out.print("Opcao: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    for (int i = 0; i < carrinho.length; i++) {
                        carrinho[i].lerDados();
                    }
                    break;
                case 2:

                    for (int i = 0; i < carrinho.length; i++) {
                        carrinho[i].exibirDados();
                    }

                    break;

                case 3:
                    Produto aux[] = new Produto[1];
                    
                    Produto carrinho2[] = new Produto[carrinho.length];
                    for (int i=0; i < carrinho.length; i++) carrinho2[i]=carrinho[i];  
                    
                    for (int i = 0; i < carrinho2.length; i++) {
                        for (int j = 0; j < carrinho2.length - 1; j++) {
                            if (carrinho2[j].getPrecoFruta() < carrinho2[j + 1].getPrecoFruta()) {
                                //aux = carrinho[j].getPrecoFruta();
                                aux[0] = carrinho2[j];
                                //carrinho[j].setPrecoFruta(carrinho[j + 1].getPrecoFruta());
                                carrinho2[j] = carrinho2[j+1];
                                //carrinho[j + 1].setPrecoFruta(aux);
                                carrinho2[j+1] = aux[0];
                            }
                        }
                    }

                    for (int i = 0; i < carrinho2.length; i++) {
                        System.out.printf("\nNome da fruta: %s ", carrinho2[i].getNomeFruta());
                        System.out.printf("\nPreco da fruta: %.2f ", carrinho2[i].getPrecoFruta());

                    }

                    break;
                case 4:
                    System.out.printf("Fruta 1 = %s\n", carrinho[0].getNomeFruta());
                    System.out.printf("Fruta 2 = %s\n", carrinho[1].getNomeFruta());
                    System.out.printf("Fruta 3 = %s\n", carrinho[2].getNomeFruta());
                    System.out.printf("Fruta 4 = %s\n", carrinho[3].getNomeFruta());
                    System.out.printf("Fruta 5 = %s\n", carrinho[4].getNomeFruta());
                    System.out.printf("Digite o numero da fruta que deseja alterar:\n");
                    numFruta = sc.nextInt();

                    carrinho[(numFruta - 1)].lerDados();

                    System.out.printf("\nDados da fruta alterados com sucesso!\n");
                    carrinho[numFruta-1].exibirDados();

                    break;

                    case 5:
                    System.out.printf("Fruta Citrica 1 = %s:\n", carrinho[0].getNomeFruta());
                    System.out.printf("Fruta Citrica 2 = %s:\n", carrinho[1].getNomeFruta());
                    System.out.printf("Fruta Citrica 3 = %s:\n", carrinho[2].getNomeFruta());
                    System.out.printf("Fruta Nao Citrica 4 = %s:\n", carrinho[3].getNomeFruta());
                    System.out.printf("Fruta Nao Citrica 5 = %s:\n", carrinho[4].getNomeFruta());
                    System.out.printf("Aumentar todos os precos - 6\n");
                    System.out.printf("Digite o numero da fruta que deseja aumentar o preco:\n");
                    numPreco = sc.nextInt();
                    if(numPreco==6){
                        for (int i = 0; i < carrinho.length; i++) {
                            carrinho[i].calcAumentoPreco();
                        }
                    }
                    else{
                        carrinho[numPreco-1].calcAumentoPreco();
                    }
                    break;
                default:
                    if(opt!=0)
                    System.out.printf("Opcao Invalida, tente novamente\n");
                    break;
            }
        } while (opt != 0);

    }

}
