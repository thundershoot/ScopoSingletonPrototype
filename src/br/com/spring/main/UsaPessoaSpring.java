package br.com.spring.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.spring.beans.BeanPessoa;
import br.com.spring.beans.BeanPessoa1;

public class UsaPessoaSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext apContext = new ClassPathXmlApplicationContext(
				"/br/com/spring/config/ApplicationContext.xml");

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BeanPessoa beanPessoa  = (BeanPessoa) apContext.getBean("pessoa");
		BeanPessoa beanPessoa1 = (BeanPessoa) apContext.getBean("pessoa");
		BeanPessoa beanPessoa2 = (BeanPessoa) apContext.getBean("pessoa");
		BeanPessoa beanPessoa3 = (BeanPessoa) apContext.getBean("pessoa");
		System.out.println(beanPessoa);
		System.out.println(beanPessoa1);
		System.out.println(beanPessoa2);
		System.out.println(beanPessoa3);
		
		BeanPessoa1 beanPessoa4 = (BeanPessoa1) apContext.getBean("pessoa1");
		BeanPessoa1 beanPessoa5 = (BeanPessoa1) apContext.getBean("pessoa1");
		BeanPessoa1 beanPessoa6 = (BeanPessoa1) apContext.getBean("pessoa1");
		BeanPessoa1 beanPessoa7 = (BeanPessoa1) apContext.getBean("pessoa1");
		System.out.println(beanPessoa4);
		System.out.println(beanPessoa5);
		System.out.println(beanPessoa6);
		System.out.println(beanPessoa7);
		
	}

}
