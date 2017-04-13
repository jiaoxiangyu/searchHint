

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;


@WebServlet("/searchMeg")
public class searchMeg extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(name);
		List<String> list =new ArrayList<String>();
		list.add(name);
		list.add(name+name);
		list.add(name+name+name);
		list.add(name+name+name+name);		
		// 集合转为json		
		response.getWriter().println(JSONArray.fromObject(list).toString());
		/*System.out.println(JSONArray.fromObject(list));*/
	}

}
