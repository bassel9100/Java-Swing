import static java.lang.System.out;

public class Card {
    private int color, value; //1 = Hearts, 2 = Diamonds, 3 = Spades, 4 = Clubs
    private String str;

    public Card(int color, int value){
            this.color = color;
            this.value = value;

    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        if(color > 4 || color < 1)
            out.println("Wrong value! Cannot be less than 1 or greater than 4");
        else
            this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value > 13 || value < 1)
            out.println("Wrong value! Cannot be less than 1 or greater than 4");
        else
            this.value = value;
    }

    @Override
    public String toString() {
        if(color == 1)
            str = "Hearts ";
        else if(color == 2)
            str = "Diamonds ";
        else if(color == 3)
            str = "Spades ";
        else if(color == 4)
            str = "Clubs ";

        if(value > 1 && value < 10)
            str += value;
        else if(value == 1)
            str += "Ace";
        else if(value == 11)
            str += "Jack";
        else if(value == 12)
            str += "Queen";
        else if(value == 13)
            str += "King";

        return str;
    }
}
