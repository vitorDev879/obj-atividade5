public class Pessoa {
    
    private String nome;
    private int id;
    private double salario; 

    
    public Pessoa(int id, String nome, double salario) {
        this.id = id; 
        this.nome = nome;
        this.salario = salario;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

