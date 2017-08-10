package lhs.struts.intercopter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class UsernameIntercepoter extends MethodFilterInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = -567046004416145323L;

	/**
	 * 
	 */


	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("haha");
		return invocation.invoke();
	}
	

}
