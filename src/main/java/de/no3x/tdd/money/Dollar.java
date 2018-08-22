package de.no3x.tdd.money;

class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Money dollar = (Money) obj;
        return amount == dollar.amount;
    }
}