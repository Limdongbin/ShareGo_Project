package com.java501.S20230401.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.java501.S20230401.model.Comm;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CommDaoImpl implements CommDao {
	private final SqlSession session;
	
	// 양동균
	@Override
	public String categoryName(int comm_id) {
		String categoryName = "";
		try {
			categoryName = session.selectOne("dgCategoryName", comm_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categoryName;
	}

	@Override
	public List<Comm> commList(int comm_id) {
		List<Comm> commList = null;
		try {
			commList = session.selectList("dgCommList", comm_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return commList;
	}




	// 유현규
	@Override
	public Comm getCommById(int comm_id) {
		return session.selectOne("hgGetCommById", comm_id);
	}
	@Override
	public Comm getCommByName(String comm_value) {
		return session.selectOne("hgGetCommByName", comm_value);
	}
	@Override
	public String getValueById(int comm_id) {
		return session.selectOne("hgCommGetValue", comm_id);
	}
	@Override
	public List<Comm> getCategoryListBySuper(Integer superId) {
		return session.selectList("hgGetCategoryListBySuper", superId);
	}





	
	// 임동빈
	@Override
	public List<Comm> boardName() {
		List<Comm> BoardList = null;
		System.out.println("CommDaoImpl CommName Start..");
		BoardList = session.selectList("SelectBoard");
		System.out.println("CommDaoImpl CommList.size()=> " + BoardList.size());
		return BoardList;
	}
	
	@Override
	public List<Comm> genderName() {
		List<Comm> GenderList = null;
		System.out.println("CommDaoImpl CommName Start..");
		GenderList = session.selectList("SelectGender");
		System.out.println("CommDaoImpl CommList.size()=> " + GenderList.size());
		return GenderList;
	}
}
