package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            String config = "mybatis.xml";
            InputStream inputStream = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory=builder.build(inputStream);
            SqlSession sqlSession=factory.openSession();
            List<Map<String, Object>>  list=sqlSession.selectList("org.example.UserMapper.find");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
