package org.velezreyes.quiz.question6.bebidas;

public class ScottCola implements Drink {
  public String getName() {
    return "ScottCola";
  }

  public boolean isFizzy() {
    return true;
  }

  public int getCost() {
    return 75;
  }
}