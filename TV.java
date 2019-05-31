class TV{
  //Atributos
  private int polegadas;
  private int canal;
  private int volume;
  private String estado;

  //Construtor
  public TV(int polegadas, int canal, int volume,String estado){
    this.polegadas = polegadas;
    this.canal = canal;
    this.volume = volume;
    this.estado = estado;
  }
  //Métodos
  public void descrever(){
      System.out.println("polegadas:"+ polegadas);
      System.out.println("Canal:"+ canal);
      System.out.println("Volume:"+ volume);
      System.out.println("Estado:"+ estado);
  }

  public int getPolegadas(){
    return polegadas;
  }
  public void setPolegadas(int polegadas){
    this.polegadas = polegadas;
  }
  public int getCanal(){
    return canal;
  }
  public void setCanal(int canal){
    this.canal = canal;
  }
  public int getVolume(){
    return volume;
  }
  public void setVolume(int volume){
    this.volume = volume;
  }
  public String getEstado(){
    return estado;
  }
  public void  setEstado(String estado){
    this.estado = estado;
  }
  public void alterarCanal(int canal){
    System.out.println("Canal Atual: " + canal);
    this.canal = canal;
  }
  public void Ligar(){
    this.estado = "Ligado";
  }
  public void Desligar(){
    this.estado = "Desligada";
  }
  public void AlterarVolume(int volume){
    System.out.println("Volume Atual: "+ volume);
    this.volume = volume;
  }
} 

public class Main{
public static void main(String []args){
  TV t1 = new TV(55,15,110,"Ligada");
  t1.descrever();
}
}
