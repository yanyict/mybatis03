package com.sc.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidSourceFactory extends DruidDataSourceFactory implements DataSourceFactory {

	private Properties properties;
	
	public DataSource getDataSource() {
		try {
			return super.createDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setProperties(Properties props) {
		this.properties=props;
	}
}
