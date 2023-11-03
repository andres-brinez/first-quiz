package org.velezreyes.quiz.question6;

import org.velezreyes.quiz.question6.bebidas.Drink;
import org.velezreyes.quiz.question6.exceptions.NotEnoughMoneyException;
import org.velezreyes.quiz.question6.exceptions.UnknownDrinkException;


/*
* Esta interfaz define el contrato para las máquinas expendedoras.
* Cada máquina puede insertar monedas (insertQuarter()),
* y presionar un botón para obtener una bebida (pressButton()).
 */


public interface VendingMachine {

  public void insertQuarter();

  /*
  *  Si no se ha insertado suficiente dinero para la bebida seleccionada, o
  *  Si la bebida seleccionada no existe,  lanzar una excepción
  * */
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException;


}