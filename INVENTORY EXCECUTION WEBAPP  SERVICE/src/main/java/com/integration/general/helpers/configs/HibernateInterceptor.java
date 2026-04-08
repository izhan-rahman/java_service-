package com.integration.general.helpers.configs;


import com.integration.general.helpers.utils.JwtUtil;
import org.hibernate.EmptyInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HibernateInterceptor extends EmptyInterceptor {
    @Value("${spring.multiTenant.prefix}")
    private final String multiTenantPrefix = "##plant##";
    @Override
    public String onPrepareStatement(String sql) {
        String plantName = JwtUtil.plt;
        sql = sql.replaceAll(multiTenantPrefix, plantName + "_");
        return super.onPrepareStatement(sql);
    }

}