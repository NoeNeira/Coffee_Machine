import java.util.Scanner;

public class CoffeeMachine {
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int cups = 9;
    int money = 550;

    public CoffeeMachine(){}

    public CoffeeMachine(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine();


        System.out.println("The coffee machine has: ");
        System.out.println(machine.water + " of water");
        System.out.println(machine.milk + " of milk");
        System.out.println(machine.coffeeBeans + " of coffee beans");
        System.out.println(machine.cups + " of disposable cups");
        System.out.println(machine.money + " of money");

        System.out.println("Write an action (buy, fill, take, remaining, exit)");

        String action = scanner.nextLine();

        switch (action){
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                int buyTipeOfCoffe = scanner.nextInt();
                switch (buyTipeOfCoffe){
                    case 1:
                        machine.comprarEspresso();
                        break;
                    case 2:
                        machine.comprarLatte();
                        break;
                    case 3:
                        machine.comprarCappuccino();
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

            case "exit":
                // agregar método para salida
                break;
        }

    }

    public void comprarEspresso() {
        int waterEspresso = 250;
        int beansEspresso = 16;
        int milkLatte = 0;
        int priceEspresso = 4;

        if (this.water >= (waterEspresso) && this.coffeeBeans >= (beansEspresso) && this.money >= (priceEspresso)) {
            this.money = this.money + priceEspresso;
            this.water = this.water - waterEspresso;
            this.coffeeBeans = this.coffeeBeans - beansEspresso;
            this.cups = this.cups - 1;
        }
    }

    public void comprarLatte() {
        int waterLatte = 350;
        int beansLatte = 20;
        int milkLatte = 75;
        int priceLatte = 7;

        if (1 <= this.cups) {
            if (this.water >= (waterLatte) && this.coffeeBeans >= (beansLatte) && this.money >= (priceLatte)) {
                this.money = this.money + priceLatte;
                this.water = this.water - waterLatte;
                this.milk = this.milk - milkLatte;
                this.coffeeBeans = this.coffeeBeans - beansLatte;
                this.cups = this.cups - 1;
            }
        }
    }

    public void comprarCappuccino() {
        int waterCappuccino = 200;
        int beansCappucino = 12;
        int milkCappucino = 100;
        int priceCappucino = 6;

        if (1 <= this.cups) {
            if (this.water >= (waterCappuccino) && this.coffeeBeans >= (beansCappucino) && this.money >= (priceCappucino)) {
                this.money = this.money + priceCappucino;
                this.water = this.water - waterCappuccino;
                this.milk = this.milk - milkCappucino;
                this.coffeeBeans = this.coffeeBeans - beansCappucino;
                this.cups = this.cups - 1;
            }
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
        System.out.println("I gave you " + money);
        money = 0;
    }

    public void mostrarStatusCoffeMachine(){
        System.out.println("The coffee machine has ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk" );
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}