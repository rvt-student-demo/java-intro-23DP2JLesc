package lv.rvt;

public class PaymentTerminal {
private double money;
private int affordableMeals;
private int heartyMeals;

public PaymentTerminal() {
this.money = 1000;
this.affordableMeals = 0;
this.heartyMeals = 0;
}

public void addMoneyToCard(PaymentCard card, double sum) {
if (sum > 0) {
card.addMoney(sum);
this.money += sum;
}
}

public boolean eatAffordably(PaymentCard card) {
double price = 2.50;
if (card.takeMoney(price)) {
this.affordableMeals++;
return true;
}
return false;
}

public boolean eatHeartily(PaymentCard card) {
double price = 4.30;
if (card.takeMoney(price)) {
this.heartyMeals++;
return true;
}
return false;
}

public String toString() {
return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
}
}
