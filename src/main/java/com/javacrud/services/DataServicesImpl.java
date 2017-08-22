package com.javacrud.services;

import java.util.List;
import com.javacrud.dao.DataDao;
import com.javacrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class DataServicesImpl implements DataServices {
	
	@Autowired
	DataDao dataDao;

	@Override
	public boolean addEntity(Employee employee) throws Exception {

		return dataDao.addEntity(employee);
	}

	@Override
	public boolean updateEntity(Employee employee) throws Exception {

		return dataDao.updateEntity(employee);
	}

	@Override
	public Employee getEntityById(long id) throws Exception {

		return dataDao.getEntityById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {

		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {

		return dataDao.deleteEntity(id);
	}

}
