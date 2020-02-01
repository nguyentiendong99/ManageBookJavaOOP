package Tailieu;

public class Document {
    private String id;
    private String tittle;
    private int publicYears;
    private String author;
    private int quantity;

    public Document(String id, String tittle, int publicYears, String author, int quantity) {
        this.id = id;
        this.tittle = tittle;
        this.publicYears = publicYears;
        this.author = author;
        this.quantity = quantity;
    }

    public Document() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPublicYears() {
        return publicYears;
    }

    public void setPublicYears(int publicYears) {
        this.publicYears = publicYears;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", tittle='" + tittle + '\'' +
                ", publicYears=" + publicYears +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
