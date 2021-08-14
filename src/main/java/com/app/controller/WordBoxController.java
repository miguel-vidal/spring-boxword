package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Word;
import com.app.service.WordService;

@RestController
@RequestMapping("/api")
public class WordBoxController {

	@Autowired
	private WordService wordServ;
	
	@CrossOrigin
	@PostMapping("/word")
	public Word saveWord(@RequestBody Word word) {
		
		return wordServ.saveWord(word);
	}
	
	@CrossOrigin
	@GetMapping("/words")
	public List<Word> listWords() {
		return wordServ.listWords();
	}
	
	@CrossOrigin
	@PostMapping("/word/container")
	public List<Word> getWordsByIdContainer(@RequestBody Word word){
		return wordServ.getContainerById(word.getIdContainer());
	}
	
	@CrossOrigin
	@GetMapping("/word/{id}")
	public Word getWord(@PathVariable("id") long id) {
		return wordServ.getWordById(id);
	}
}
