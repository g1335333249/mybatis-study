package com.g1335333249.config;

import com.g1335333249.plugins.TestPlugin;
import com.g1335333249.typeHandlers.TestTypeHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author guanpeng
 * @date 2019-07-11 14:15
 */
@Configuration
@MapperScan(basePackages = {"com.g1335333249.mapper"})
@EnableTransactionManagement(proxyTargetClass = true)
public class MybatisConfig {
    @Autowired
    private DataSource dataSource;

    @Lazy(value = false)
    @Bean(value = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        Properties properties = new Properties();
        properties.setProperty("proxyFactory", "CGLIB");
        properties.setProperty("lazyLoadingEnabled", "true");
        properties.setProperty("aggressiveLazyLoading", "false");
        sqlSessionFactoryBean.setConfigurationProperties(properties);
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 自定义TypeHandler
        sqlSessionFactoryBean.setTypeHandlers(new TypeHandler[]{new TestTypeHandler()});
        //自定义Plugin
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new TestPlugin()});
        return sqlSessionFactoryBean.getObject();
    }

    @Primary
    @Lazy(value = false)
    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory(), ExecutorType.SIMPLE);
    }

    @Lazy(value = false)
    @Bean(name = "batchSqlSessionTemplate")
    public SqlSessionTemplate batchSqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory(), ExecutorType.BATCH);
    }

    @Bean(name = "dataSourceTransactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
