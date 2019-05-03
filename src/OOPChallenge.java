
    
    class Burger{
        private String name;
        private String meat;
        private String bread;
        private double price = 5.00;

        private String add1;
        private double add1Price;

        private String add2;
        private double add2Price;

        public Burger(String name, String meat, String bread) {
            this.name = name;
            this.meat = meat;
            this.bread = bread;
        }

        public void addAddition1(String name, double price) {
            this.add1 = name;
            this.add1Price = price;
        }

        public void addAddition2(String name, double price) {
            this.add2 = name;
            this.add2Price = price;
        }

        public double getTotal() {
            double totalPrice = this.price;
            if (this.add1 != null) {
                totalPrice += this.add1Price;
            }
            if (this.add2 != null) {
                totalPrice += this.add2Price;
            }
            return totalPrice;
        }
    }

public class OOPChallenge {
    public static void main(String[] args) {

        Burger burger = hamBurger();
        burger.addAddition1("lettuce", 0.35);
        burger.addAddition2("extra cheese", 1.15);
        System.out.println(burger.getTotal()); 
    }

    public static Burger hamBurger() {
        return new Burger("cheeseburger", "turkey", "sourdough");
    }
}