/*
mkdir -p src/main/java/org/allowed/bitarus
http://localhost:8081/jsp-example-1.0/index.jsp?user=TestASD
*/
package org.allowed.bitarus;

import java.util.logging.Logger;
import java.util.logging.Level;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

public class Handler{
    private ServletRequest request;
    private ServletResponse response;
    private JspWriter out;
    
    public Handler(ServletRequest request, ServletResponse response,JspWriter out){
        this.request = request;
        this.response = response;        
        this.out = out;
    }

    public Handler(PageContext pageContext){
        this.request = pageContext.getRequest();
        this.response = pageContext.getResponse();        
        this.out = (JspWriter) pageContext.getAttribute(pageContext.OUT) ;
    }
    
    public void writeHandler(){
        try{
          this.out.println(String.format("<p>Handler up %s</p>" , this.request.getParameter("user") ));
        }
        catch(Exception ex){            
        }          
    }
    
    public void writeIP(){
        try{
            this.out.print("!!! Your IP address is " + this.request.getRemoteAddr());
        }
        catch(Exception ex){            
        }          
    }
        
}