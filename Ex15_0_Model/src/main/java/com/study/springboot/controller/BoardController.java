package com.study.springboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.service.BoardServiceImpl;

@Controller
public class BoardController {

	@RequestMapping("/board1")
	public String read(Model model) {
		
		// BoardServiceImpl에서 구현
		List listBoard = null;
		BoardServiceImpl bs = new BoardServiceImpl();
		listBoard = bs.getList();
		
		
		// 가져온 내용을 jsp로 보내기 위해 model에 담음
		model.addAttribute("listBoard", listBoard);
		
		return "result";
	}
}
