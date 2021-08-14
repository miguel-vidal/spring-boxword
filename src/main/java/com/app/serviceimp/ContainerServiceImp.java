package com.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Container;
import com.app.repository.ContainerRepository;
import com.app.service.ContainerService;

@Service
public class ContainerServiceImp implements ContainerService {

	@Autowired 
	private ContainerRepository contRep;
	
	@Override
	public List<Container> listContainers() {
		
		return contRep.findAll();
	}

	@Override
	public Container save(Container container) {
	
		return contRep.save(container);
	}

	@Override
	public void delete(long id) {
		contRep.deleteById(id);
	}

	@Override
	public Container update(Container container, long id) {

		Container containerDB= contRep.findById(id).get();
		
		containerDB.setName(container.getName());
		containerDB.setLevel(container.getLevel());
		containerDB.setLenWords(container.getLenWords());
		
		return contRep.save(containerDB);
	}

	@Override
	public List<Container> getContainersByUserId(long id) {

		return contRep.findContainersByIdUser(id);
	}

	@Override
	public Container getContainerById(long id) {
		return contRep.findById(id).get();
	}

	
}
