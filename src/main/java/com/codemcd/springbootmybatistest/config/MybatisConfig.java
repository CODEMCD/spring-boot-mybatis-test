package com.codemcd.springbootmybatistest.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(basePackages = "com.codemcd", annotationClass = com.codemcd.springbootmybatistest.config.MainConnection.class, sqlSessionFactoryRef = "mainSqlSessionFactory")
public class MybatisConfig {

    @Bean(name = "mainSqlSessionFactory")
    public SqlSessionFactory getMainSqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        configureSqlSessionFactory(sqlSessionFactoryBean, dataSource);

        return sqlSessionFactoryBean.getObject();
    }

    private void configureSqlSessionFactory(SqlSessionFactoryBean sqlSessionFactoryBean, DataSource dataSource) throws IOException {
        PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.codemcd.springbootmybatistest.domain");
        sqlSessionFactoryBean.setConfigLocation(pathResolver.getResource("classpath:/mybatis-config.xml"));
        sqlSessionFactoryBean.setMapperLocations(pathResolver.getResources("classpath:/mapper/*.xml"));
    }
}
