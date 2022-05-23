package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		GuestBookVo vo = new GuestBookVo();
		vo.setPassword("1234");
		vo.setMessage("to complete");
		vo.setRegDate("2022-05-23");

		new GuestBookDao().insert(vo);
	}

	private static void testFindAll() {
		List<GuestBookVo> list = new GuestBookDao().findAll();
		for(GuestBookVo vo : list) {
			System.out.println(vo);
		}
	}



}