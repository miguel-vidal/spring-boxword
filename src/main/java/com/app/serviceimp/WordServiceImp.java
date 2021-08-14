package com.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Word;
import com.app.repository.WordRepository;
import com.app.service.WordService;

@Service
public class WordServiceImp implements WordService{

	@Autowired
	private WordRepository wordRepo;
	
	@Override
	public Word saveWord(Word word) {

		return wordRepo.save(word);
	}

	@Override
	public List<Word> listWords() {
		List<Word>allWords= wordRepo.findAll();
		
		if(!allWords.isEmpty()) {
			return allWords;
		}
		
		return null;
	}

	@Override
	public Word getWordById(long id) {
		return wordRepo.findById(id).get();
	}

	@Override
	public Word Update(Word word, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		wordRepo.deleteById(id);
	}

	@Override
	public List<Word> getContainerById(long id) {
		
		return wordRepo.findWordsByIdContainer(id);
	}
}
