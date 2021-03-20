package com.cloud.wxxserver.wxxserver.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Mybatis  第二个ds3数据源配置
 * 多数据源配置依赖数据源配置
 */
@Configuration
@MapperScan(basePackages ="com.cloud.**.dao.wxx", sqlSessionTemplateRef  = "ds3SqlSessionTemplate")
public class MybatisPlusConfig4ds3 {

    //ds3数据源
    @Bean("ds3SqlSessionFactory")
    public SqlSessionFactory ds3SqlSessionFactory(@Qualifier("ds3DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath:mybatis/mapper/wxx/**/*.xml"));
        return sqlSessionFactory.getObject();
    }

    //事务支持
    @Bean(name = "ds3TransactionManager")
    public DataSourceTransactionManager ds3TransactionManager(@Qualifier("ds3DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ds3SqlSessionTemplate")
    public SqlSessionTemplate ds3SqlSessionTemplate(@Qualifier("ds3SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}