package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.nt.command.UploadCommand;

@Controller
public class UploadController {
	
	@GetMapping("/upload.htm")
	private String showHome(@ModelAttribute("uplCmd") UploadCommand cmd) {
		System.out.println("UploadController.showHome()");
		return "upload_form";
	}
	
	
	@PostMapping("/upload.htm")
	private String fileUpload(Map<String,Object> map ,@ModelAttribute("uplCmd") UploadCommand cmd) throws Exception{
		System.out.println("UploadController.fileUpload()");
		System.out.println(cmd.getFile1());
		MultipartFile file1 = cmd.getFile1();
		MultipartFile file2 = cmd.getFile2();
		
		File dir=null;
		File uplfile1=null,uplfile2=null;
		InputStream is1,is2;
		OutputStream os1,os2;
		
		String filename1;
		String filename2;

		System.out.println(file1);
		
		filename1 =file1.getOriginalFilename();
		filename2 =file2.getOriginalFilename();
		
		is1 = file1.getInputStream();
		is2 = file2.getInputStream();
		
		if(dir == null) {
			dir = new File("D:/store");
			dir.mkdir();
		}
		
		uplfile1 = new File("E:/store"+"  "+filename1);
		uplfile2 = new File("E:/store"+"  "+filename2);
		
		os1 = new FileOutputStream(uplfile1);
		os2 = new FileOutputStream(uplfile2);
		
		map.put("file1", filename1);
		map.put("file2", filename2);
		
		return "upload_form";
		
	}

}
