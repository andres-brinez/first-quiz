package org.velezreyes.quiz.question6.bebidas;

/* ?

Esta interfaz define el contrato para las bebidas que puede dispensar la máquina expendedora.

Cada bebida debe proporcionar su nombre (getName()), i
Indicar si es efervescente o no (isFizzy()),
y proporcionar su costo (getCost()).

 */
public interface Drink {
  public String getName();
  public boolean isFizzy();
  public int getCost();
}