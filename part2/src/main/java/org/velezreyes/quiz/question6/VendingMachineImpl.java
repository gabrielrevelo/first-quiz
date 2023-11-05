package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {

  private double balance;
  private Map<String, Drink> drinks;

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  private VendingMachineImpl() {
    this.balance = 0;
    this.drinks = new HashMap<>();
    this.drinks.put("ScottCola", new DrinkImpl("ScottCola", true, 0.75));
    this.drinks.put("KarenTea", new DrinkImpl("KarenTea", false, 1));
  }

  @Override
  public void insertQuarter() {
    this.balance += 0.25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    Drink drink = this.drinks.get(name);
    if (drink == null) {
      throw new UnknownDrinkException();
    }
    if (this.balance < drink.getPrice()) {
      throw new NotEnoughMoneyException();
    }
    this.balance -= drink.getPrice();
    return drink;
  }
}