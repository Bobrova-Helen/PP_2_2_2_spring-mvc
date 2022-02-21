package web.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

public class CharsetFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain next) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        next.doFilter(request, response);
    }

    public void destroy() {
    }
}
