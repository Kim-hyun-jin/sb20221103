package com.oracle.sb20221103.khj.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Custom403Handler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		log.info("------------ACCESS DENIED------------");
		
		response.setStatus(HttpStatus.FORBIDDEN.value());
		
		//JSON 요청인지 확인
		String contentType = request.getHeader("Content-Type");
		
		boolean jsonRequest = contentType.startsWith("application/json");
		log.info("json boolean: "+ jsonRequest);
		
		//일반 요청
		if(!jsonRequest) {
			response.sendRedirect("/main/login?error=ACCESS_DENIED");
		}

	}

}
