package com.sc;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sc.dao.UserMapper;
import com.sc.po.User;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		User record=new User();
		record.setUserName("z");

		String resource = "configuration.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession();
		try {
			UserMapper mapper=session.getMapper(UserMapper.class);
			// π”√resultType
			List<User> list=mapper.selectUserByParam(record);
			for(User u:list){
				System.out.println(u.getUserName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
