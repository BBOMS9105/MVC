package com.study.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.springboot.dao.BoardDAOImpl;

public class BoardServiceImpl {

	// 3. 자동으로 생성되게 변경
	@Autowired
	BoardDAOImpl bd;
	
	// 2. 필드로 옮김
	// BoardDAOImpl bd = new BoardDAOImpl();
	
	public List getList() {
		
		List listBoard = null;
		
		// 1. 클래스 직접 생성
		//BoardDAOImpl bd = new BoardDAOImpl();
		listBoard = bd.selectList();
		
		return listBoard;
	}
}
