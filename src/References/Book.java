package References;

public class Book extends Document {
    private String ID;
    private String Tyle;

    public Book(String ID, String tyle) {
        this.ID = ID;
        Tyle = tyle;
    }

    public Book(String name, String tittle, int publicyear, String authors, int quantity, String ID, String tyle) {
        super(name, tittle, publicyear, authors, quantity);
        this.ID = ID;
        Tyle = tyle;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTyle() {
        return Tyle;
    }

    public void setTyle(String tyle) {
        Tyle = tyle;
    }

    @Override
    public String toString() {
        return super.toString() + "Book{" +
                "ID='" + ID + '\'' +
                ", Tyle='" + Tyle + '\'' +
                '}';
    }
}
