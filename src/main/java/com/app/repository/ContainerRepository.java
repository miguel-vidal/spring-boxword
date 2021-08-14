package com.app.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Container;


@Repository
public interface ContainerRepository extends JpaRepository<Container, Long>{

	@Query(value="SELECT * FROM Container WHERE iduser = :id_cont", nativeQuery = true)
	List<Container> findContainersByIdUser(long id_cont); 
}
