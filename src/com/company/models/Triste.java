package com.company.models;

public class Triste implements Estado{

  private Tamagochi t;

  public Triste(Tamagochi t){
    this.t = t;
    System.out.println("Buáááá!");
  }

  @Override
  public void comer(){
    System.out.println("Beep Beep Urg!");
  }

  @Override
  public void beber(){
    System.out.println("Beep Beep Beep! Plin Plin!");
  }

  @Override
  public void carinho(){
    this.t.setEstado(new Feliz(this.t));
  }

}
