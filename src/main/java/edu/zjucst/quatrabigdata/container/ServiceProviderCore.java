package edu.zjucst.quatrabigdata.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 该类的主要作用是加载Spring的beans.xml文件
 */
public class ServiceProviderCore {
	protected ApplicationContext ctx;
	
	/**
	 * @param filename  Spring的beans.xml
	 */
	public void load(String filename){
		ctx=new ClassPathXmlApplicationContext(filename);
	}
}
