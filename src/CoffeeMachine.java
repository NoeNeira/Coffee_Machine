package machine;
import java.util.Scanner;

public class CoffeeMachine {
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int cups = 9;
    int money = 550;

    public CoffeeMachine(){}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine();
        String action = null;

        while(!"exit".equals(action)){
            System.out.println("Write an action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();
            switch (action){
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String buyTipeOfCoffe = scanner.next();
                    switch (buyTipeOfCoffe){
                        case "1":
                            machine.comprarEspresso();
                            break;
                        case "2":
                            machine.comprarLatte();
                            break;
                        case "3":
                            machine.comprarCappuccino();
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    machine.rellenar();
                    break;

                case "take":
                    machine.retirar();
                    break;

                case "remaining":
                    machine.mostrarStatusCoffeMachine();
                    break;
            }
        }
    }

    public void comprarEspresso() {
        int waterEspresso = 250;
        int beansEspresso = 16;
        //int milkLatte = 0;
        int priceEspresso = 4;

        if (this.water < (waterEspresso)){
            System.out.println("Sorry, not enough water!");
        }
        else if(this.coffeeBeans < (beansEspresso)){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else {
            this.money = this.money + priceEspresso;
            this.water = this.water - waterEspresso;
            this.coffeeBeans = this.coffeeBeans - beansEspresso;
            this.cups = this.cups - 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public void comprarLatte() {
        int waterLatte = 350;
        int beansLatte = 20;
        int milkLatte = 75;
        int priceLatte = 7;

        if (this.water < (waterLatte)){
            System.out.println("Sorry, not enough water!");
        }
        else if(this.coffeeBeans < (beansLatte)){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else if(this.milk < (milkLatte)){
            System.out.println("Sorry, not enough milk!");
        }
        else {
            this.money = this.money + priceLatte;
            this.water = this.water - waterLatte;
            this.milk = this.milk - milkLatte;
            this.coffeeBeans = this.coffeeBeans - beansLatte;
            this.cups = this.cups - 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public void comprarCappuccino() {
        int waterCappuccino = 200;
        int beansCappucino = 12;
        int milkCappucino = 100;
        int priceCappucino = 6;

        if (this.water < (waterCappuccino)){
            System.out.println("Sorry, not enough water!");
        }
        else if(this.coffeeBeans < (beansCappucino)){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else if(this.milk < (milkCappucino)){
            System.out.println("Sorry, not enough milk!");
        }
        else {
            this.money = this.money + priceCappucino;
            this.water = this.water - waterCappuccino;
            this.milk = this.milk - milkCappucino;
            this.coffeeBeans = this.coffeeBeans - beansCappucino;
            this.cups = this.cups - 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public void rellenar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        int addWater = scanner.nextInt();
        this.water = water + addWater;
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = scanner.nextInt();
        milk = milk + addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        coffeeBeans = coffeeBeans + addCoffeeBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = scanner.nextInt();
        cups = cups + addCups;
    }

    public void retirar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void mostrarStatusCoffeMachine(){
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk" );
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }
}