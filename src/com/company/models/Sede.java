package com.company.models;

public class Sede implements Estado{

  private Tamagochi t;

  public Sede(Tamagochi t){
    this.t = t;
    System.out.println("Tô com Sede!");
  }

  @Override
  public void comer(){

  }

  @Override
  public void beber(){
    t.setEstado(new Feliz(t));
  }

  @Override
  public void carinho(){

  }

}
