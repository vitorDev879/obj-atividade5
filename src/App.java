import java.util.Scanner;

public class App {
    
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);

        //1.Crie uma classe Pessoa com id, nome, salário encapsulados.
        //2.Crie uma classe Principal com um vetor de pessoas e adicione 10 pessoas com id, nome e salário no vetor.

        Pessoa[] pessoas = new Pessoa[10];

        for (int i = 0; i < 10; i++) { 
            System.out.println("Digite o id da pessoa" + (i + 1) + ":");
            int id = sc.nextInt(); 
            
            System.out.println("Digite o nome da pessoa" + (i + 1) + ":");
            String nome = sc.next(); 

            System.out.println("Dgite o salario" + (i + i) + ":");
            double salario = sc.nextDouble(); 

            pessoas[i] = new Pessoa(id, nome, salario); 
        }

        System.out.println("Usuarios adicionados: ");
        for (Pessoa pessoa : pessoas) { 
            System.out.println("ID: " + pessoa.getId() + ",Nome" + pessoa.getNome() + "Salario: " + pessoa.getSalario());
        }        
    }
}
