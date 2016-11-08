package homework.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseAction extends ActionSupport {
    public HttpServletRequest request(){
		return ServletActionContext.getRequest();
    }
    public HttpServletResponse response(){
		return ServletActionContext.getResponse();
    }
    public ServletContext application(){
    	return ServletActionContext.getServletContext();
    }
    public HttpSession session(){
		return ServletActionContext.getRequest().getSession();
    }
}
