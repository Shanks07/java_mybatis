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
			reader = Resources.getResourceAsReader("config.xml");// �����������ļ�
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<TestVO> getAll(){
		sqlSession = sqlSessionFactory.openSession();//����ͼ�ν����������ݿ�
		TestVOMapper testVOMapper = sqlSession.getMapper(TestVOMapper.class);//�������ݿ����Ӷ���ʵ������ѯ����
		return testVOMapper.getAll();
	}
	public static void main(String[] args) {
		
	}
}
