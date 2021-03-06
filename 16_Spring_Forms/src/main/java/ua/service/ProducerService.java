package ua.service;

import java.util.List;

import ua.entity.Producer;

public interface ProducerService {

	List<Producer> findAll();

	void delete(int id);

	void save(Producer form);

	Producer findOne(int id);
	
}
