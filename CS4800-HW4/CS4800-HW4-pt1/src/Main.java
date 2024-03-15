public class Main {
    public static void main(String[] args){
        // Pizza Hut Large with 3 toppings
        PizzaBuilder builder = new PizzahutBuilder();
        Pizza pizza1 = builder.setSize("Large").addTopping("Ham").addTopping("Chicken").addTopping("Bacon").build();
        pizza1.eat();

        // Pizza Hut Small with 2 toppings
        builder = new PizzahutBuilder();
        Pizza pizza2 = builder.setSize("Small").addTopping("Spinach").addTopping("Ham and Pineapple").build();
        pizza2.eat();

        // Little Caesar's Medium with 8 toppings
        builder = new LittleCaesarsBuilder();
        Pizza littleCaesarsMedium = builder.setSize("Medium").addTopping("Mushrooms").addTopping("Olives").addTopping("Pepperoni")
                .addTopping("Bacon").addTopping("Spinach").addTopping("Sausage").addTopping("Ham").addTopping("Tomato and Basil").build();
        littleCaesarsMedium.eat();

        // Little Caesar's Small with 6 toppings
        builder = new LittleCaesarsBuilder();
        Pizza littleCaesarsSmall = builder.setSize("Small").addTopping("Sausage").addTopping("Chicken")
                .addTopping("Bacon").addTopping("Tomato and Basil").addTopping("Extra Cheese").addTopping("Ham").build();
        littleCaesarsSmall.eat();

        // Domino's Small with 1 topping
        builder = new DominosBuilder();
        Pizza dominosSmall = builder.setSize("Small").addTopping("Extra Cheese").build();
        dominosSmall.eat();

        // Domino's Large with 3 toppings
        builder = new DominosBuilder();
        Pizza dominosLarge = builder.setSize("Large").addTopping("Pepperoni").addTopping("Mushrooms").addTopping("Olives").build();
        dominosLarge.eat();
    }
}