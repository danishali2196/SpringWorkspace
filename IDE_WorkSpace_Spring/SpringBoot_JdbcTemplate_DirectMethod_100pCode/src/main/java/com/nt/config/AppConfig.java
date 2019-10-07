
package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PresentationConfig.class,ServiceConfig.class})
public class AppConfig {
	


}
