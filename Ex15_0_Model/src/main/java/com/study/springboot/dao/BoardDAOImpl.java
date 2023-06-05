package com.study.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl {
	
	public List selectList() {
		// DB에 접속하여 게시판의 글을 가져오고
		List listBoard = new ArrayList();
		listBoard.add("one");
		listBoard.add("two");
		listBoard.add("three");
				
		System.out.println("two : " + listBoard.get(1));
		
		return listBoard;
	}
}
