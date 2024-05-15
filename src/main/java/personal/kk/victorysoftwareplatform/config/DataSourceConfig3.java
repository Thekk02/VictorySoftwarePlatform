package personal.kk.victorysoftwareplatform.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author kk
 * @description ERP数据库配置
 * @date 2024-5-15 10:58:01
 */
@Configuration
@MapperScan(basePackages = "personal.kk.victorysoftwareplatform.mappers.db3", sqlSessionFactoryRef = "db3SqlSessionFactory")
public class DataSourceConfig3 {

    @Bean("db3DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db3") //读取application.yml中的配置参数映射成为一个对象
    public DataSource getDb1DataSource(){
        return DataSourceBuilder.create().build();
    }

    //@Primary
    @Bean("db3SqlSessionFactory")
    public SqlSessionFactory db1SqlSessionFactory(@Qualifier("db3DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        // mapper的xml形式文件位置必须要配置，不然将报错：no statement （这种错误也可能是mapper的xml中，namespace与项目的路径不一致导致）
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/db3/*.xml"));
        bean.setTypeAliasesPackage("personal.kk.victorysoftwareplatform.entity");
        return bean.getObject();
    }


    @Bean("db3SqlSessionTemplate")
    public SqlSessionTemplate db1SqlSessionTemplate(@Qualifier("db3SqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}