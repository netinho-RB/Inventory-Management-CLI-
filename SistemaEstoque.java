import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  class Produto {
    private String nome;
    private Double preco;
    private int quantidade;
    

    public Produto(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
   public String getNome() {
     return nome;
   }
   public void setNome (String nome){
    this.nome = nome;
  }

   public double getPreco() {
    return preco;
   }

   public void setPreco(double preco) {
    this.preco = preco;
   }

   public int getQuantidade() {
    return quantidade; 
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  }


  public class SistemaEstoque {
     public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);
      leitor.useLocale(java.util.Locale.US); // Esta linha "conserta" o ponto vs vírgula
      List<Produto> inventario = new ArrayList<>();

      int opcao = 0;

      System.out.println("\n=== BEM-VINDO À NETOSTORE ===\n");


      while(opcao != 3) {

        System.out.println("\n --- MENU PRINCIPAL --- \n:");
        System.out.println("Escolha uma opção: "); 
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Sair");
    
        opcao = leitor.nextInt();
        leitor.nextLine();


        switch (opcao) {

          case 1:

            System.out.println("\n Nome do produto");
            String nome = leitor.nextLine();
            System.out.println("\n Preço do produto");
            double preco = leitor.nextDouble();
            System.out.println("\n Quantidade do produto");
            int quantidade = leitor.nextInt();
            leitor.nextLine();
 
            inventario.add ( new Produto(nome, preco, quantidade ));
            System.out.println("\n --- Produto Cadastrado com Sucesso ---");


            break;


          case 2:
 

            System.out.println("\n--- LISTAGEM DE ESTOQUE ---");
            if (inventario.isEmpty()){
              System.out.println("Estoque vazio.");
            } else {
              for (Produto p : inventario) {
                System.out.println("Produto: " + p.getNome());
                System.out.println("Preço: R$ " + p.getPreco());
                System.out.println("Quantidade: " + p.getQuantidade());
                System.out.println("-----------------------------");
              }
            }


            break;


          case 3:

            System.out.println("Saindo do sistema. Até logo!");

            break;

          default:
            System.out.println("Opção inválida. Tente novamente.");
        }
    
         
      }
      


        leitor.close(); 

  
    

      
     }
  }