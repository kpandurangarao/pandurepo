package com.javacodegeeks.util;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.jdbc.core.JdbcTemplate;

public class StoredProcedure implements Tasklet{

	private DataSource dataSource;
	private String sql;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {
		
		List<Person> result=new ArrayList<Person>();
		JdbcTemplate myJDBC=new JdbcTemplate(getDataSource());		
        result = myJDBC.query(sql, new PersonMapper());
        System.out.println("Number of records effected: "+ result);
        return RepeatStatus.FINISHED;
		
	}

}
