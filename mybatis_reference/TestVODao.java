package dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.TestVOMapper;
import vo.TestVO;

public class TestVODao {
	private static Reader reader;
	private static SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;

	static {
		try {
			reader = Resources.getResourceAsReader("config.xml");// 加载主配置文件
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<TestVO> getAll(){
		sqlSession = sqlSessionFactory.openSession();//类似图形界面连接数据库
		TestVOMapper testVOMapper = sqlSession.getMapper(TestVOMapper.class);//利用数据库连接对象实例化查询功能
		return testVOMapper.getAll();
	}
	public static void main(String[] args) {
		
	}
}
