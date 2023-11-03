package org.velezreyes.quiz.question6;

import org.velezreyes.quiz.question6.bebidas.Drink;
import org.velezreyes.quiz.question6.exceptions.NotEnoughMoneyException;
import org.velezreyes.quiz.question6.exceptions.UnknownDrinkException;

public interface VendingMachine {

  public void insertQuarter();

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException;
}