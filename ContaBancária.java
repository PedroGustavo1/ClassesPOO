
class Conta{
  private String NomeCliente;
  private double Saldo;
  private double Limite;


public Conta(String NomeCliente, double Saldo,double Limite){
  this.NomeCliente = NomeCliente;
  this.Saldo = Saldo;
  this.Limite = Limite;
}

public void Sacar(double Quantidade){
  if(Quantidade > Saldo){
    System.out.println("ERRO 324: O VALOR REQUISITADO ÉÉ MAIOR QUE O SALDO DISPONIVEL!!" + "\n");
  }else{
    Saldo = Saldo - Quantidade;
    System.out.println("OPERAÇÃO CONCLUIDA!");
    System.out.println("SALDO ATUAL: "+ Saldo + "\n");
  }
}

public void Depositar(double Quantidade){
  if (Quantidade+Saldo>Limite){
    System.out.println("ERRO 449: A CONTA ATINGE O LIMITE CASO O DEPÓÓSITO SEJA FEITO!");
  }else{
    Saldo = Saldo + Quantidade;
    System.out.println("OPERAÇÃO CONCLUIDA!");
    System.out.println("SALDO ATUAL: "+ Saldo + "\n");
  }
}
public void Extrato(){
  System.out.println("BANCO PP");
  System.out.println("CLIENTE: "+ NomeCliente);
  System.out.println("SALDO: "+ Saldo);
  System.out.println("LIMITE DA CONTA: "+ Limite + "\n");
}

public String getNomeCliente(){
  return NomeCliente;
}

public void setNomeCliente(String NomeCliente){
  this.NomeCliente = NomeCliente;
}

public double getSaldo(){
  return Saldo;
}
public void setSaldo(double Saldo){
  this.Saldo = Saldo;
}

public double getLimite(){
  return Limite;
}

public void setLimite(Double Limite){
  this.Limite = Limite;
}


}


class Main {
  public static void main(String[] args) {
    Conta c = new Conta("Predo",125.50,500.00);
    c.Depositar(125.50);
    c.Extrato();
    c.Sacar(252.00);

  }
}
