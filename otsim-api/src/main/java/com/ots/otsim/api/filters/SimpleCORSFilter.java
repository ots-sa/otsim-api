package com.ots.otsim.api.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SimpleCORSFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods",
                "POST, GET, OPTIONS, PUT, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers",
                "X-Requested-With, content-type, YdataToken, YdataTokenRequest");

        // allow CORS to send custom response headers
        // https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS#Access-Control-Expose-Headers
        response.setHeader("Access-Control-Expose-Headers",
                "YdataTokenResponse");
        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }

    @Bean
    public FilterRegistrationBean simpleCORSFilterBean() {
      final FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
      filterRegBean.setFilter(new SimpleCORSFilter());
      filterRegBean.addUrlPatterns("/*");
      filterRegBean.setEnabled(Boolean.TRUE);
      filterRegBean.setName("Simple CORS Filter");
      filterRegBean.setAsyncSupported(Boolean.TRUE);
      return filterRegBean;
    }
}
