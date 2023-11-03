package org.velezreyes.quiz.question6;

import org.velezreyes.quiz.question6.bebidas.Drink;
import org.velezreyes.quiz.question6.bebidas.KarenTea;
import org.velezreyes.quiz.question6.bebidas.ScottCola;
import org.velezreyes.quiz.question6.exceptions.NotEnoughMoneyException;
import org.velezreyes.quiz.question6.exceptions.UnknownDrinkException;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
  private int moneyInserted = 0;
  private static VendingMachineImpl instance;
  private Map<String, Drink> drinkTypes = new HashMap<>();

  private VendingMachineImpl() {
    drinkTypes.put("ScottCola", new ScottCola());
    drinkTypes.put("KarenTea", new KarenTea());
  }

  public static synchronized VendingMachineImpl getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  public void insertQuarter() {
    moneyInserted += 25;
  }

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (!drinkTypes.containsKey(name)) {
      throw new UnknownDrinkException();
    }

    Drink drink = drinkTypes.get(name);

    if (moneyInserted < drink.getCost()) {
      throw new NotEnoughMoneyException();
    }

    moneyInserted -= drink.getCost();

    return drink;
  }
}

