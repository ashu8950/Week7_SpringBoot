package com.example.demo.componenet;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Component
public class EmployeeBean {
	
	private int eid;
	private String ename;
	
	
	private DepartmentBean depBean;
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(EmployeeBean.class);
	
	public EmployeeBean() {
		
	}
	
	@Autowired
	public EmployeeBean(DepartmentBean depBean) {
		this.depBean = depBean;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void showEmpDetails() {
		logger.debug("Employee id : {}",eid);
		logger.debug("Employee name : {}",ename);
		depBean.setDepName("CSE");
		logger.debug("Deparment name : {}",depBean.getDepName());
	}
	
	
}
