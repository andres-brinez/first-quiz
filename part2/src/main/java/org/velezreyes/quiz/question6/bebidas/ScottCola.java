package org.velezreyes.quiz.question6.bebidas;

/* ?
Implementación de la interfaz Drink.
Representa una bebida ScottCola, que es efervescente y cuesta 75 centavos.
 */
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