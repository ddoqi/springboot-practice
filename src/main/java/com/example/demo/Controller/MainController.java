package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Dto.InsertDTO;
import com.example.demo.Service.InsertService;


//Controller가 return을 dispatcher한테 해준다.
//dispatcher가 return값을 받아서 view 리졸버한테 갖다주지만
//@ResponseBody로 보내면 dispatcher가 view 리졸버한테 안갖다쥼
//
@Controller
public class MainController {
	
	
	@Autowired
	InsertService insertService;
	
	 @RequestMapping(value = "/")
	   public String index() {
	      return "main/index";
	   }
	
	
	@RequestMapping(value="/insert/join")
	public String join() {
		System.out.println("조인페이지");
		return "insert/join";
	}
	
	
//	@ResponseBody
//	a태그로 url요청한건 무조건 get방식
	// get방식은 method가 숨겨져잇는데, 디폴트로 이미 get이라고 설정이 되잇는거고
	//post로 요청할땐, 꼭 이 url요청을 할때 post방식이라고 명시를 해주어야한다.
	@RequestMapping(value = "/Insert", method = RequestMethod.POST)
	//@ModelAttribue 가 url요청이 들어오면 InsertDTO 에 자동으로 join.html의 name을 기준으로 바인딩 작업을 해준다.
	public String insert(@ModelAttribute InsertDTO dto) throws Exception {
		
		System.out.println("insert행위");
		System.out.println("dto는 ? "+ dto.getUserName());
		
		insertService.insert(dto) ;
		
		return "main/index";
	}

}
