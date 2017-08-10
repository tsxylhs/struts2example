package lhs.struts.action;

import com.opensymphony.xwork2.ActionSupport;


public class actionTest extends ActionSupport {
private String username;

	public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
	public String init() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	public String login()throws Exception{
		if(username.equals("zhangsan")){
			return "loginS";
		}
		else{
			return "loginF";
		}
		
	}

}
