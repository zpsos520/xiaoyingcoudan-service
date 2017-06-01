import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shua1.xiaoyingcoudan.base.mapper.EmpInfoMapper;
import com.shua1.xiaoyingcoudan.base.model.EmpInfo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
		EmpInfoMapper empInfoMapper = applicationContext.getBean(EmpInfoMapper.class);
		EmpInfo emp = empInfoMapper.selectByPrimaryKey(1);
		System.out.println(emp.getName());
	}
}
