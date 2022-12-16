package model.dao;

import java.util.List;

import model.entities.Department;

public interface DapatmentDao {
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer Id);
	Department findById(Integer id);
	List<Department> findAll();
	

}
