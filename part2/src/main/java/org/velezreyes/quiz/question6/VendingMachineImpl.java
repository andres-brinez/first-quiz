package org.velezreyes.quiz.question6;

import org.velezreyes.quiz.question6.bebidas.Drink;
import org.velezreyes.quiz.question6.bebidas.KarenTea;
import org.velezreyes.quiz.question6.bebidas.ScottCola;
import org.velezreyes.quiz.question6.exceptions.NotEnoughMoneyException;
import org.velezreyes.quiz.question6.exceptions.UnknownDrinkException;

import java.util.HashMap;
import java.util.Map;
/*
* Implementa la interfaz VendingMachine
* Representa una máquina expendedora.
* */
public class VendingMachineImpl implements VendingMachine {
  // Mantiene un registro de cuánto dinero se ha insertado
  private int moneyInserted = 0;
  private static VendingMachineImpl instance; // Singleton instance

  private Map<String, Drink> drinkTypes = new HashMap<>();

  private VendingMachineImpl() {
    // Registra las bebidas disponibles
    drinkTypes.put("ScottCola", new ScottCola());
    drinkTypes.put("KarenTea", new KarenTea());
  }

  // Singleton
  public static synchronized VendingMachineImpl getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  public void insertQuarter() {
    moneyInserted += 25;
  }

  //  Cuando se presiona un botón, que representa una un pedido de bebida,
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

    //  verifica si la bebida solicitada existe
    if (!drinkTypes.containsKey(name)) {
      throw new UnknownDrinkException();
    }

    Drink drink = drinkTypes.get(name);

    // Verifica si se ha insertado suficiente dinero para la bebida.
    if (moneyInserted < drink.getCost()) {
      throw new NotEnoughMoneyException();
    }

    // Devuelve la bebida y resta su costo del dinero insertado.
    moneyInserted -= drink.getCost();

    return drink;
  }
}

