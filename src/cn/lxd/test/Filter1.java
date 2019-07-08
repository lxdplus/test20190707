package cn.lxd.test;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.DataOutput;
import java.io.IOException;

@WebFilter(filterName = "Filter1")
public class Filter1 implements Filter {
    public void destroy() {
        System.out.println("Aend");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("111111111");
        chain.doFilter(req, resp);
        System.out.println("放行");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Astart");
    }

}
