public abstract class Animal {
    protected int length;
    protected double weight;
    protected String sound;

    public Animal(int length, double weight){
        this.length = length;
        this.weight = weight;
    }

    public int getLength(){
        return length;
    }

    public double getWeight(){
        return weight;
    }

    public abstract String sound();
}
