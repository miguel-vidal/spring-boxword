package com.app.repository;

import com.app.entity.Word;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long>{

	@Query(value="SELECT * FROM Word WHERE idcontainer = :id_container", nativeQuery = true)
	List<Word> findWordsByIdContainer(long id_container); 
}
