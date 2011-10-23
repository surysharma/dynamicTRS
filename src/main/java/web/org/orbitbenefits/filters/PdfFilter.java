package web.org.orbitbenefits.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by IntelliJ IDEA.
 * User: sureshsharma
 * Date: 20/10/2011
 * Time: 20:15
 * To change this template use File | Settings | File Templates.
 */
public class PdfFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponseWrapper httpServletResponseWrapper = new PdfResposeWrapper((HttpServletResponse)response);

        filterChain.doFilter(request, httpServletResponseWrapper);

        String resultHtml = httpServletResponseWrapper.toString();


    }

    class PdfResposeWrapper extends HttpServletResponseWrapper{


        private final StringWriter stringWriter = new StringWriter(2048) ;

         PdfResposeWrapper(HttpServletResponse response){
            super(response);

        }
        @Override
        public PrintWriter getWriter() throws IOException {
            return new PrintWriter(stringWriter);
        }

        @Override
        public  String toString(){
                  return stringWriter.toString();
        }

    }

    @Override
    public void destroy() {
    }
}
