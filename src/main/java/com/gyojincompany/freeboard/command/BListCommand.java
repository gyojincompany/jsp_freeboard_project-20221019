package com.gyojincompany.freeboard.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyojincompany.freeboard.dao.BoardDao;
import com.gyojincompany.freeboard.dto.BoardDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		
		ArrayList<BoardDto> dtos = dao.list();
		//dto들의 컬렉션인 dtos(ArrayList타입)가 반환됨
		
		request.setAttribute("list", dtos);		
		
	}

}
