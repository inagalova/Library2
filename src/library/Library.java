/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Owner
 */
public abstract class Library {

    public String bookName;
    public String authorName;
    public int date;
    public int dueDate;
    public String name;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if (bookName != null) {
            this.bookName = bookName;
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        if (authorName != null) {
            this.authorName = authorName;
        }
    }
    
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date > 0) {
            this.date = date;
        }
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        if (dueDate > 0) {
            this.dueDate = dueDate;
        }
    }

    public String geName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public Library(String bookName,String authorName, int date, int dueDate, String name) {
        setBookName(bookName);
        setAuthorName(authorName);
        setDate(date);
        setDueDate(dueDate);
        setName(name);
    }

    public Library() {
        this("King Rat","James Clavell", 1, 19, "Ina Galova");
    }

    public Library(Library obj) {
        this(obj.getBookName(),obj.getAuthorName(), obj.getDate(), obj.getDueDate(), obj.geName());
    }

    public static void main(String[] args) {

    }
}
