package com.wtm.utils;

import org.apache.ibatis.jdbc.SQL;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UtilsApplicationTests {

	/*
	*工具类
	* sql,scriptRunner,sqlRunner
	 */
	@Test
	void contextLoads() {
		String sql=new SQL(){
			{
			 SELECT("A.ID");
			 FROM("TABLE");
			 WHERE("ID=1");
			}
		}.toString();
		System.out.println(sql);
	}



}
