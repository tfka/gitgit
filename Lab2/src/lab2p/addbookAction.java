package lab2p;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import lab2p.book;
public class addbookAction extends ActionSupport
{
	public book mybook=new book();
	private sqlfind sf=new sqlfind();
	private String name;
	private String isbn;
	private String title;
	priva
		return this.name;
	}
	public void same(String name)
	{
		this.name =name;
	}
	public String getIsbn()
	{
		return sbn;
	}
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
		mybook.setIsbn(isbn);
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setTitle(String title)
	{
		this.title=title;
		mybook.setTitle(title);
	}
	public String getPublish()
	{
		return this.publish;
	}
	public void setPublish(String publish)
	{
		this.publish=publish;
		mybook.setPublish(publish);
	}
	public String getDate()
	{
		return this.date;
	}
	public void setDate(String date)
	{
		this.date=date;
		mybook.setDate(date);
	}
	public String getPrice()
	{
		return this.price;
	}
	public void setPrice(String price)
	{
		this.price=price;
		mybook.setPrice(price);
	}	
	public String execute() throws Exception
	{
		
		if(sf.isauthor(name)) 
		{
			sf.InsertSql(mybook);
			return "ok";
		}
		else 
			{
			sf.InsertSql(mybook);
		return "newauthor";
			}
	}
}
