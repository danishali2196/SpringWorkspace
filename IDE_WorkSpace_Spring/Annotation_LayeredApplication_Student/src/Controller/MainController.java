package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import DTO.StudentDTO;
import Service.StudentService;
import VO.StudentVO;

@Component("controller")
public final class MainController {
	@Autowired
	private StudentService service;

//	public MainController(StudentService service) {
//		this.service = service;
//	}
	
	public String processStudent(StudentVO vo)throws Exception{
		
		StudentDTO dto=null;
		String result=null;
		
		//convert vo class object data to dto class object
		dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		//use service class object
		result=service.generateResult(dto);
		return result;
		
	}
	
}
