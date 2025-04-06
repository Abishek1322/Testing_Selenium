package HomeAssignments;

public class Library {
	
	public String addBook(String bookTitle) //Method creation to add book with return statement
	{
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	public void issueBook()// created another method
	{
		System.out.println("Book Issued Successfully");
	}
	public static void main(String[] args) 
	{
	Library Book = new Library(); //object creation to access the methods in the class
	Book.addBook("Money"); //calling a method using the object
	Book.issueBook();//calling a method using the object
	}

}
