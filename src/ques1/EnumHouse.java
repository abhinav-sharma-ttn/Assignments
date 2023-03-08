package ques1;

public class EnumHouse {

    enum House {
        FLAT("Flat", 100000), VILA("Vila", 200000);

        private String name;
        private double price;

        House(String name, double price) {
            this.name = name;
            this.price = price;
        }


        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }
}

