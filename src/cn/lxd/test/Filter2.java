package cn.lxd.test;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter2")
public class Filter2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("start");
        chain.doFilter(req, resp);
        System.out.println("end");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
