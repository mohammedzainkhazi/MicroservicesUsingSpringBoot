package com.example.mslabspringboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MslabSpringbootTestApplication {
    public void pattern(int number_of_rows)
	{ int iterator_inner,iterator_outer;
		  for(iterator_outer=0;iterator_outer<number_of_rows;iterator_outer++)
		  {
			for (iterator_inner=0;iterator_inner<=iterator_outer;iterator_inner++)
			{
				   System.out.print('* ');
			}
			System.out.println();
		  }
	}
	public static void main(String[] args) {
		// SpringApplication.run(MslabSpringbootTestApplication.class, args);
		System.out.println('Hello Gurucharan d k !');
		pattern(5);
	}

}
