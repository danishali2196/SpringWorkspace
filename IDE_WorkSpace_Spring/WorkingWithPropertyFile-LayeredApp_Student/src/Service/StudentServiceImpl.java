package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BO.StudentBO;
import DAO.StudentDAO;
import DTO.StudentDTO;
@Service
public final class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;
	
//	public StudentServiceImpl(StudentDAO dao) {
//		this.dao = dao;
//	}

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int count=0;
		
		//write B.logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if (dto.getM1()>=35 && dto.getM2()>=35 && dto.getM3()>=35) {
			result="pass";
		}
		else
			result="fail";
		
		//prepared BO class object having persistable data
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		//use dao
		count=dao.insert(bo);
		
		//process the result
		if (count==0) {
			return "Student registration failed ::: result is->"+result;
			
		}
		else
			return "Student Registration succeded :::result is-->"+result;
	
	}

}
