package com.cn;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.nio.cs.Surrogate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@MapperScan(value = "com.cn.mapper")//批量扫描mapper接口
@SpringBootApplication
public class SpringBoot06DataMybatisApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBoot06DataMybatisApplication.class, args);
		new SpringBoot06DataMybatisApplication().myBatisGeneratorUtil();
	}


	public void  myBatisGeneratorUtil(){
		String genCfg = "/generatorConfig.xml";
		/*List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;

		URL resource = SpringBoot06DataMybatisApplicationTests.class.getResource(genCfg);

		File configFile = new File(resource.getFile());
		System.out.println(configFile.getAbsolutePath());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		try {
			config = cp.parseConfiguration(configFile);
			System.out.println("加载到了配置文件.......");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		}*/


		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		try {
			config = cp.parseConfiguration(
					Surrogate.Generator.class.getResourceAsStream(genCfg));

			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
