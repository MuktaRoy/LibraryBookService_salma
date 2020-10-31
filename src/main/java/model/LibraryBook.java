package model;

public class LibraryBook {

    private String id;
    private String title;
    private String type;
    private String author;
    private String publisher;
    private String price;
    private String Year_of_publication;
    private String description;

    public LibraryBook(String id, String title, String type, String author, String publisher,
                       String price, String year_of_publication, String description) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.Year_of_publication = year_of_publication;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear_of_publication() {
        return Year_of_publication;
    }

    public void setYear_of_publication(String year_of_publication) {
        Year_of_publication = year_of_publication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

