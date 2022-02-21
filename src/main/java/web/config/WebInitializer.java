package web.config;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        CharsetFilter charsetFilter=new CharsetFilter();
        FilterRegistration.Dynamic filterRegistration = servletContext
                .addFilter("charsetFilter", charsetFilter);
        filterRegistration.addMappingForUrlPatterns(null, false, "/*");

        FilterRegistration.Dynamic filterRegistration1 = servletContext
                .addFilter("characterEncodingFilter", characterEncodingFilter);
        filterRegistration1.addMappingForUrlPatterns(null, false, "/*");
    }
}
