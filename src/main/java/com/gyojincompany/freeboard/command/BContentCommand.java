package com.gyojincompany.freeboard.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyojincompany.freeboard.dao.BoardDao;
import com.gyojincompany.freeboard.dto.BoardDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bid = request.getParameter("bid");
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.content_view(bid);
		
		request.setAttribute("content", dto);

	}

}
