package com.example.demo.Dao;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.Dto.InsertDTO;


//interface : 다형성
@Mapper
public interface TestMapper {
	
	void insert23(InsertDTO dto);

}
