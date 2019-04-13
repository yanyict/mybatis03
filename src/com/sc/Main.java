package com.sc;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sc.dao.ItemBeanMapper;
import com.sc.po.ItemBean;
import com.sc.po.User;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//º”‘ÿmybatisµƒ≈‰÷√
		String resource = "configuration.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
	
		SqlSession session=ssf.openSession();
	
		ItemBeanMapper mapper=session.getMapper(ItemBeanMapper.class);
		List<ItemBean> list=mapper.selectAllItem();
		for(ItemBean i:list){
			System.out.println(i.getOrder().getOrderAuthor());
		}
//		Map<String,Object> obj=mapper.selectByProtites(u);
//		System.out.println(obj.get("USER_NAME"));
//		System.out.println(obj.get("TRUE_NAME"));
	}

}
