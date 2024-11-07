package com.cloud.shopping;

import com.cloud.shopping.entity.Account;
import com.cloud.shopping.mapper.UserMapper;
import com.cloud.shopping.service.UserService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.cloud.shopping.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloud.shopping.utils.Result;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * Unit test for simple App.
 */
public class UserTest
        extends TestCase {
//    @Autowired
//    private UserMapper userMapper;
//    @Autowired
//    private UserService userService;

    private final Logger logger = Logger.getLogger(this.getClass());

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(UserTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testSelectByPage() throws Exception {

        //加载MyBatis配置⽂文件
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
//                SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory =
//                sqlSessionFactoryBuilder.build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
////        String statement = "com.cloud.shopping.mapper.UserMapper.insert";
//        String statement = "com.cloud.shopping.mapper.AccoutMapper.save";
//        Account account = new Account(1L,"张三","123123",22);
//        sqlSession.insert(statement,account);
//        sqlSession.commit();

//        User user = new User();
//        user.setUsername("admin");
//        user.setPassword("123qwe");
//        user.setNickname("管理员");
//        user.setEmail("1091165843@qq.com");
//        user.setPhone(18392566666L);
//
//        sqlSession.insert(statement,user);
//        sqlSession.commit();
//
//        Result result = userService.register(user);
//        try {
//            if (result.isSuccess()) {
//                logger.info("注册成功");
//            } else {
//                logger.info("注册失败: " + result.getMsg());
//            }
//        } catch (Exception e) {
//            logger.error("出错", e);
//        }


//        List<User> users = userMapper.selectByPage(1, 1);
//        logger.info(users);


    }
}
