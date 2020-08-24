package exercicio01;

public class Funcionario{
    private String nome;
    private int horasTrab;
    private double custoPorHoraTrab, salario;

    public Funcionario(){
    }

    public Funcionario(String nome, int horasTrab, double custoPorHoraTrab){
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.custoPorHoraTrab = custoPorHoraTrab;
    }

    public double calcSalario(int horasTrab, double custoPorHoraTrab){
        salario = horasTrab *custoPorHoraTrab;
        return salario;
    }

    public String exibirDados(String nome, int horasTrab, double custoPorHoraTrab, double salario){
        return "Nome funcionario: " + nome + " - Horas Trabalhadas: " + 
                "- Custo por hora: " + custoPorHoraTrab + " - Salario: " + salario;
    }
}