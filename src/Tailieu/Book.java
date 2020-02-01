package Tailieu;

public class Book extends Document {
    private String id;
    private String type;

    public Book(String id ,String type){
        this.id=id;
        this.type= type;

    }

    public Book(String id, String tittle, int publicYears, String author, int quantity, String id1, String type) {
        super(id, tittle, publicYears, author, quantity);
        this.id = id1;
        this.type = type;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+ "Book{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

