package References;

public class Document {
    private String Name;
    private String Tittle;
    private int publicyear;
    private String authors;
    private int quantity;
    public Document(){

    }
    public Document(String name, String tittle, int publicyear, String authors, int quantity) {
        Name = name;
        Tittle = tittle;
        this.publicyear = publicyear;
        this.authors = authors;
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public int getPublicyear() {
        return publicyear;
    }

    public void setPublicyear(int publicyear) {
        this.publicyear = publicyear;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + "Document{" +
                "Name='" + Name + '\'' +
                ", Tittle='" + Tittle + '\'' +
                ", publicyear=" + publicyear +
                ", authors='" + authors + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
