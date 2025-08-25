package mvc.spring.xml.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcSpringDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;    // dnt use
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MvcSpringConfig.class}; // path to config
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};  // separator for dispatcher servlet
    }
}
