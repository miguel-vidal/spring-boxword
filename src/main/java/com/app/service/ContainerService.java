package com.app.service;

import java.util.List;

import com.app.entity.Container;

public interface ContainerService {

	public List<Container> listContainers();
	
	public Container getContainerById(long id);
	
	public Container save(Container container);
	
	public void delete(long id);
	
	public Container update(Container container, long id);
	
	public List<Container> getContainersByUserId(long id);
}
