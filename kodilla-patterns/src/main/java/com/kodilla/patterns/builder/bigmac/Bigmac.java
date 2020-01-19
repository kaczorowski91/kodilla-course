package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    public static final String STANDARDROLL = "STANDARDROLL";
    public static final String ROLLWITHSESAME = "ROLLWITHSESAME";
    public static final String ROLLWITHOUTSESAME = "ROLLWITHOUTSESAME";
    public static final int MINBURGERS = 0;
    public static final int MAXBURGERS = 4;
    public static final String STANDARDSAUCE = "STANDARDSAUCE";
    public static final String THOUSANDISLANDDRESSING = "THOUSANDISLANDDRESSING";
    public static final String BARBECUESAUCE  = "BARBECUESAUCE";
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILIPEPPER = "CHILIPEPPER";
    public static final String MUSHROOM = "MUSHROOM";
    public static final String PRAWN = "PRAWN";
    public static final String CHEESE = "CHEESE";

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if(bun.equals(STANDARDROLL)||bun.equals(ROLLWITHSESAME)||bun.equals(ROLLWITHOUTSESAME)){
                this.bun = bun;
                return this;
            }
            else {
                throw new IllegalStateException("Incorrect bun in order");
            }
        }

        public BigmacBuilder burgers(int burgers) {
        if(burgers>MINBURGERS && burgers<MAXBURGERS) {
            this.burgers = burgers;
            return this;
        }else
            throw new IllegalStateException("Incorrect numbers of burgers");
        }

        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals("STANDARDSAUCE") || sauce.equals("THOUSANDISLANDDRESSING") ||
                    sauce.equals("BARBECUESAUCE")){
                this.sauce = sauce;
                return this;
            }else
                throw new IllegalStateException("Incorrect name of sauce");
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(ingredient.equals(LETTUCE)||ingredient.equals(ONION)||ingredient.equals(BACON)
                    ||ingredient.equals(CUCUMBER)||ingredient.equals(CHILIPEPPER)||ingredient.equals(MUSHROOM)
                    ||ingredient.equals(PRAWN)||ingredient.equals(CHEESE)){
                ingredients.add(ingredient);
                return this;
            }else
                throw new IllegalStateException("Incorrect ingredient");
        }

        public Bigmac build() {

            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac:" +
                "\nbun= " + bun +
                "\nburgers " + burgers +
                "\nsauce= " + sauce +
                "\ningredients " + ingredients;
    }
}
