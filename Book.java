/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPage)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPage;
        refNumber= "";
    }
    
    
    // GETTERS (satisfies question 83)
    //getter for author
    public String getAuthor()
    {
        return author;
    }
    //getter for title
    public String getTitle()
    {
        return title;
    }
    //getter for pages (satisfies question 85)
    public int getPages()
    {
       return pages;
    }
    //getter for refNumber (satisfies question 88)
    public String getRefNumber()
    {
       return refNumber;
    }
    
    
    //SETTERS (satisfies question 88)(satisfies question 90)
    //setter/mutator for refNumber
    public void setRefNumber(String ref)
    {
        if(ref.length()>2)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("ERROR: reference number must be at least three number long");
        }
    }
    
    
    //PRINT (satisfies question 84)
    //print for author
    public void printAuthor()
    {
        System.out.println(author);
    }
    //print for title
    public void printTitle()
    {
        System.out.println(title);
    }
    
    //PRINT DETIAILS METHOD (satisfies question 87)(satisfies question 89)
    public void printDetails()
    {   
        String store = "ZZZ";
        if(refNumber.length()>0)
        {
            store = refNumber;
        }
        
        
        System.out.println( "Title: " +title+ ", Author: " +author+ ", Page Count: " +pages+ ", Reference #: " +store);
    }
    
}
