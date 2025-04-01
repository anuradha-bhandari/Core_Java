/*1) Write a Java program to create a class called "Book" with attributes 
for title, author, and ISBN, and methods to add,view,show,update and remove 
book record from array of object ,ask size of array of object from user.
*/
import java.util.*;
class Book
{
	private int ISBN;
	private String title,author;
	
	public void setISBN(int ISBN)
    {
		this.ISBN=ISBN;
	}
   public int getISBN()
   {
	   return ISBN;
   }   
   
   public void setTitle(String title )
    {
		this.title=title;
	}
   public String getTitle()
   {
	   return title;
   }   
   
   public void setAuthor(String author)
    {
		this.author=author;
	}
   public String getAuthor()
   {
	   return author;
   }   
}

class Library 
{
	Book b1[];
	String I_title;
	int I_isbn;
	String d_title;
	void setBook(Book b1[])
	{
	  this.b1=b1;
	}
	
	void view()
	{   System.out.println("____________________________________________");
		for(int i=0;i<b1.length;i++)
		{
	     System.out.println("Author name:"+b1[i].getAuthor()+"\nISBN: "+b1[i].getISBN()+"\nTitle: "+b1[i].getTitle());	
		}
	}
	
	void add(Book b2[])
	{
	 Book newb[]=new Book[b1.length+b2.length];	//Empty array of adding
	 for(int i=0;i<b1.length;i++)//4
	 {
	   newb[i]=b1[i];  
	 }
     System.out.println("After Adding new Employee Records");
     for(int i=0;i<b2.length;i++)
	 {
	   newb[b1.length+i]=b2[i];  
	 } 
      b1=newb;
	}
	
	void update(String I_title,int I_isbn)
	{
	   int c=0;
	  for(int i=0;i<b1.length;i++)
	  {
		if(I_title.equals(b1[i].getTitle()))
        {
		    b1[i].setISBN(I_isbn); 
			c=1;
		
		}
		
	  }
	  
	  if(c==0)
        {
			System.out.println("record found not");
		}
       
	}	
	int c=0;
	void remove(String d_title)
	{
		//this.b=b;
	 for(int i=0;i<b1.length-1;i++)
	 {
		if(d_title.equals(b1[i].getTitle()))
		{
		    b1[i]=b1[i+1];
		    c=1;
		}

	 }
      if(c==0)
	  {
		System.out.println("Not record found");  
	  }	

      System.out.println("____________________________________________");
		for(int i=0;i<b1.length-1;i++)
		{
	     System.out.println("Author name:"+b1[i].getAuthor()+"\nISBN: "+b1[i].getISBN()+"\nTitle: "+b1[i].getTitle());	
		}	  
	}
}
public class PojoBook_21_oct
{
 public static void main(String x[])
 {
  
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=s.nextInt();
  
    int choice;
	//Library l1=new Library();
  do{
	 Book bk[]=new  Book [size];  // array of refernce
	 for(int i=0;i<bk.length;i++)
	 {
		bk[i]=new Book();  //Array of object
	    s.nextLine();
		System.out.println("Enter the Title of book");
		String t=s.nextLine();
         
        System.out.println("Enter the Author of book");
		String a=s.nextLine();	

        System.out.println("Enter the ISBN book");
		int isbn=s.nextInt();		
    
        bk[i].setTitle(t);
        bk[i].setAuthor(a);	
		bk[i].setISBN(isbn);		
		
	}
    Library l1=new Library();
	l1.setBook(bk);
	l1.view();
	
	    System.out.println("Case1:Add");
	    System.out.println("Case2:Update");
	    System.out.println("Case3:Remove");
		
		System.out.println("Enter ur choice");
	    choice=s.nextInt();
      
	switch(choice)
	{
	 case 1:
	 {	 	  
	  System.out.println("Add new Employee Records");
	  System.out.println("____________________________________________");
	  Book bk2[]=new Book[2];  // array of refernce
	  for(int i=0;i<bk2.length;i++)
	   {
		 bk2[i]=new Book();  //Array of  object
		 s.nextLine();
		 System.out.println("Enter the Title of book");
		 String t=s.nextLine();
         
         System.out.println("Enter the Author of book");
		 String a=s.nextLine();	

        System.out.println("Enter the ISBN book");
		int isbn=s.nextInt();		

        bk2[i].setTitle(t);
        bk2[i].setAuthor(a);	
		bk2[i].setISBN(isbn);		
		
	  }
	 l1.add(bk2);
	 l1.view();
	 break;
	}
	case 2:
	{
	s.nextLine();
	System.out.println("Enter the Title which want to update to ISBN");
	String I_title=s.nextLine();
	
	System.out.println("Enter the ISBN which want to update");
	int I_isbn=s.nextInt();
	l1.update(I_title,I_isbn);
	l1.view();
	break;
	}
	case 3:
	{
	 s.nextLine();
     System.out.println("Enter the deleting title");
	 String d_title=s.nextLine();
	 l1.remove(d_title);
	 break;
	}
	/*case 4:
	{
		System.exit(0);
	}*/
	default:
	{
	  System.out.println("No such operation here");
	  break;
	}
  }
	
  }while(choice!=0);//l1.view();
 
 }
}