import javax.naming.directory.InvalidAttributeValueException;

public class Author {
    public String firstName, lastName;
    public int writtenBooksCount;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws InvalidAttributeValueException {
        if(firstName != null) {
            this.firstName = firstName;
        } else {
            throw new InvalidAttributeValueException("Author's first name must be different than NULL!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws InvalidAttributeValueException {
        if(lastName != null) {
            this.lastName = lastName;
        } else {
            throw new InvalidAttributeValueException("Author's last name must be different than NULL!");
        }
    }

    public int getWrittenBooksCount() {
        return writtenBooksCount;
    }

    public void setWrittenBooksCount(int writtenBooksCount) throws InvalidAttributeValueException {
        if(writtenBooksCount >= 0) {
            this.writtenBooksCount = writtenBooksCount;
        } else {
            throw new InvalidAttributeValueException("Author's written books count must be 0 or bigger!");
        }
    }

    public Author(String firstName, String lastName, int writtenBooksCount) throws InvalidAttributeValueException{
        setFirstName(firstName);
        setLastName(lastName);
        setWrittenBooksCount(writtenBooksCount);
    }

    public Author() throws InvalidAttributeValueException {
        this("James","Clavell", 12);
    }

    public Author(Author author) throws InvalidAttributeValueException {
        this(author.getFirstName(), author.getLastName(), author.getWrittenBooksCount());
    }
}
