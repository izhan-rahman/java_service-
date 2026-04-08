package com.integration.general.helpers.configs;

import com.integration.general.InventoryExecWebServiceApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InventoryExecWebServiceApplication.class);
	}

}
