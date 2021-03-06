package com.ssafy.peopool.model.repo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssafy.peopool.model.SugCard;
import com.ssafy.peopool.model.Suggestion;

@Repository
public interface SuggestionRepo {

	// 면접 제안
	int registerSuggestion(Suggestion suggestion);

	// 면접 제안 수락
	int acceptSuggestion(Suggestion suggestion);

	// 면접 제안 거절
	int rejectSuggestion(int index);
	
	// 면접 제안 거절
	int cancelSuggestion(int index);

	// 면접 제안 삭제
	int deleteSuggestion(int index);

	// 면접 제안 조회
	List<SugCard> getSuggestion(int index);
	
	// 기업의 면접요청 기록 조회
	List<SugCard> getEntSuggestion(int index);
	

}
