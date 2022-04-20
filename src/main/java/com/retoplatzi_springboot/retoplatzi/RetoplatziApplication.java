package com.retoplatzi_springboot.retoplatzi;

import com.retoplatzi_springboot.retoplatzi.bean.Bean1;
import com.retoplatzi_springboot.retoplatzi.bean.Bean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetoplatziApplication implements CommandLineRunner {
private Bean1 bean1;
private Bean2 bean2;
@Autowired
	public void RetoplatziApplication(Bean1 bean1, Bean2 bean2){
this.bean1 = bean1;
this.bean2 = bean2;
	}
	public static void main(String[] args) {
		SpringApplication.run(RetoplatziApplication.class, args);
	}

	@Override
	public void run(String... args){
		bean1.print(bean2);
	}
}
