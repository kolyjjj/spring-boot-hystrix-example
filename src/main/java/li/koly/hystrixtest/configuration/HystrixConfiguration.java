package li.koly.hystrixtest.configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixConfiguration {

    @Bean
    public ServletRegistrationBean hystrixServletRegistrationBean() {
        return new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/hystrix.stream");
    }
}
