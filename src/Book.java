import javax.naming.directory.InvalidAttributeValueException;

public class Book {

    public String title, description;
    public double price;
    public Author author;

    public Book(String title, String description, double price, String firstName, String lastName, int writtenBooksCount) throws InvalidAttributeValueException {
        setTitle(title);
        setDescription(description);
        setPrice(price);
        this.author = new Author(firstName, lastName, writtenBooksCount);
    }

    public Book() throws InvalidAttributeValueException {
        this("King rat", "A novel about the WWII", 20.00, "James", "Clavell", 12);
    }

    public Book(Book book) throws InvalidAttributeValueException {
        this(book.getTitle(), book.getDescription(), book.getPrice(), book.author.getFirstName(), book.author.getLastName(), book.author.getWrittenBooksCount());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws InvalidAttributeValueException {
        if(title != null) {
            this.title = title;
        } else {
            throw new InvalidAttributeValueException("Book's title must not be empty!");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidAttributeValueException {
        if(price >= 0.0) {
            this.price = price;
        } else {
            throw new InvalidAttributeValueException("Price must be higher or equal to 0BGN!");
        }
    }
}
