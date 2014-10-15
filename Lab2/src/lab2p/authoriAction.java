package lab2p;
import com.opensympy.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import lab2p.sqlfind;
import lab2p.book;
import java.util.ArrayList;
import java.util.List;
public class authoriAction extends ActionSupport
{
	private sqlfind sf=new sqlfind();
	public String execute() throws Exception
	{
		List<author> w=sf.getauthorinf();
		
		ActionContext.getContext().put("authorlist", sf.geta
		n SUCCESS;
	}
}
