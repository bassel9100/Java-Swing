public class article {
    private String barcode;
    private String description;
    private int count;
    private double retail_price;

    public article(String barcode, String description, int count, int retail_price){
        this.barcode = barcode;
        this.description = description;
        if(count >= 0)
            this.count = count;
        else
            System.out.println("You can't put 0 or negative amount to inventory");
        if(retail_price > 0)
            this.retail_price = retail_price;
        else
            System.out.println("Price of article cannot be negative or zero");
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(double retail_price) {
        this.retail_price = retail_price;
    }

    public void buy(int x){
        count += x;
    }

    public void sell(int x){
        if(count - x >= 0)
            count -= x;
    }
}
