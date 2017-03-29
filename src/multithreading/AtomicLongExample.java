package multithreading;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AtomicLongExample implements Servlet {
	
	private final AtomicLong count = new AtomicLong();
	
	Vector vec = new Vector<>();
	public long getCount() {
		return count.get();
	}
	
	public void service(ServletRequest req, ServletResponse resp) {
		/*BigInteger i = extractFromRequest(req);
		BigInteger[] factors = factor(i);*/
		count.incrementAndGet();
		//encodeIntoResponse(resp, factors);
		}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
