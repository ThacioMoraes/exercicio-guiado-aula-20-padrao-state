package com.company.models;

public class Fome implements Estado {

  private Tamagochi t;

  public Fome(Tamagochi t){
      this.t = t;
      System.out.println("Tô com fome!");
  }

  @Override
  public void comer(){
    this.t.setEstado(new Feliz(this.t));
  }

  @Override
  public void beber(){

  }

  @Override
  public void carinho(){

  }

}
