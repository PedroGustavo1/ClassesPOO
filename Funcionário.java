class Funcionario{
  //Atributos
  private int codigo;
  private String nome;
  private int CPF;
  private String endereco;
  private String telefone;
  private int idade;
  private double salario;
  private int num_dependentes;


  //Construtor
  public Funcionario(int codigo, String nome, int CPF, String endereco, String telefone, int idade, double salario, int num_dependentes){

    this.codigo = codigo;
    this.nome = nome; 
    this.CPF = CPF;
    this.endereco = endereco;
    this.telefone = telefone;
    this.idade = idade;
    this.salario = salario;
    this.num_dependentes = num_dependentes;
  }

  //Métodos
  public void exibir(){
    System.out.println("Código: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + CPF);
    System.out.println("Endereço: " + endereco);
    System.out.println("Telefone: " + telefone);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: " + salario);
    System.out.println("N° Dependentes: " + num_dependentes);
  }

  public void setSalario(double salario){
    
    this.salario = salario;
  }

  public double getCalculaSalarioLinquido (int porcentagem){
    return (salario - (salario*(11/100)) + (salario*(num_dependentes/100)));

  }

}
