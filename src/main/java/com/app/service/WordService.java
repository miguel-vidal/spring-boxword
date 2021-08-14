package com.app.service;

import java.util.List;
import com.app.entity.Word;

public interface WordService {

	public Word saveWord(Word word);
	
	public List<Word> listWords();
	
	public Word getWordById(long id);
	
	public Word Update(Word word, long id);
	
	public void delete(long id);
	
	public List<Word> getContainerById(long id);
}
