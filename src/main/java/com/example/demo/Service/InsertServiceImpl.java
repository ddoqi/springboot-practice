package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TestMapper;
import com.example.demo.Dto.InsertDTO;

@Service
public class InsertServiceImpl implements InsertService {
	
	@Autowired
	private TestMapper testmapper;

	@Override
	public void insert(InsertDTO dto) throws Exception {
		// TODO Auto-generated method stub

		testmapper.insert23(dto);
		//testmapper.딜리트 23(dto);
	}
	
	

}
