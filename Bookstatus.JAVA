//to check book
//developed by cRaZZysKuLL
//version 1.2.3

import java.util.*;
class Books
{
	String book_title = new String();
	String author_name = new String();
	Books(String book_title,String author_name)
	{
		this.book_title = book_title;
		this.author_name = author_name;	
	}
	void Display()
	{
		System.out.println("Book Title = "+book_title);
		System.out.println("Author Name = "+author_name);
	}
}
class Search extends Books
{
		int price;
		String status = new String();
		Search(int price,String status,String book_title,String author_name)
		{
			super(book_title,author_name);
			this.price = price;
			this.status = status;
		}
		void Display()
		{
			System.out.println("Book Title = "+book_title);
			System.out.println("Author Name = "+author_name);
			System.out.println("Book Price = "+price);
			System.out.println("Book Status = "+status);
		}
		void searchBook(String title,String stat)
		{
			if(title.equals(book_title))
			{
				System.out.println("Matched");
				if(stat.equals(status))
				{
					System.out.println("Book is in stock");
				}
				else
				{
					System.out.println("Book is not in stock");
				}
			}
			else
			{
				System.out.println("Book is not available");
			}
		}
		
}
class Bookstatus
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Search[] b = new Search[n];
		for(int i=0;i<n;i++)
		{
			b[i] = new Search(200,"yes","TCR","BALA");
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(i+1+" : ");
			b[i].searchBook("TCR","no");
		}
	}
}

