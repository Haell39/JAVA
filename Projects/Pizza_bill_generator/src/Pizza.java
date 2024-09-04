package Projects.Pizza_bill_generator.src;

public class Pizza {

    private String size;
    private Boolean veg;
    private int price;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    









    public void getPizzaPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPizzaPrice'");
    }

    
}
