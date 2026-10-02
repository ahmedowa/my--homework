ublic class Main {
    public static void main(String[]args) {

    class Product {
        private String name;
        private int price;
        private String productionDate;
        private String producer;
        private String city;
        private boolean customer;
        public Product(String name, int price, String productionDate, String producer,
                       String city, boolean customer) {
            this.name = name;
            this.price = price;
            this.productionDate = productionDate;
            this.producer = producer;
            this.city = city;
            this.customer = customer;
        }



         public void preciseInfo() {
            System.out.println("Название товара: " + name);
            System.out.println("Цена: " + price);
            System.out.println("Дата производства: " + productionDate);
            System.out.println("Производитель: " + producer);
            System.out.println("Страна происхождения: " + city);
            System.out.println("бронирования покупателем: " + customer);
            }
    }

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra",3000,"Samsung Corp.", "Korea","Korea" , true);
        productsArray[1] = new Product("Fridge",30000,"01.02.2016","LG","USA",true);
        productsArray[2] = new Product("Laptop",15000,"02.03.2026","Intel","Russia",true);
        productsArray[3] = new Product("TV",4000,"09.06.2921","Sony","Japan",false);
        productsArray[4] = new Product("Audio",2000,"01.10.1986","JBL","Chine",false);
        for (int a = 0; a<productsArray.length; a++) {
        productsArray[a].preciseInfo();
        }
        class Park {
            private String parkName;
            public Park(String parkName) {
                this.parkName = parkName;
            }
            class Attraction {
                private String name;
                private String workingTime;
                private int cost;
                public Attraction(String name, String workingTime, int cost) {
                    this.name = name;
                 this.workingTime = workingTime;
                 this.cost = cost;

 }
 public void printInfo() {
                    System.out.println("Парк: " + parkName);
                    System.out.println("Аттракцион: " + name);
                    System.out.println("Время работы: " + workingTime);
                        System.out.println("Стоимость: " + cost + " руб.");
 }
            }
        }
 Park myPark=new Park("Ривьера");

        Park.Attraction rollerCoaster = myPark.new Attraction("Американские горки", "10:00 - 22:00", 500);
        Park.Attraction ferrisWheel = myPark.new Attraction("Колесо обозрения", "10:00 - 22:00", 400);
                rollerCoaster.printInfo();
                ferrisWheel.printInfo();
                }
        }























