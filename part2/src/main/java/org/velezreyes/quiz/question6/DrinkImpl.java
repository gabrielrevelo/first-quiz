package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {
    private final String name;
    private final boolean isFizzy;
    private final double price;

    public DrinkImpl(String name, boolean isFizzy, double price) {
      this.name = name;
      this.isFizzy = isFizzy;
      this.price = price;
    }

    @Override
    public String getName() {
      return this.name;
    }

    @Override
    public boolean isFizzy() {
      return this.isFizzy;
    }

    @Override
    public double getPrice() {
      return this.price;
    }
  }
