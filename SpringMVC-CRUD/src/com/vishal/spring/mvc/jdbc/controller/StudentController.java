package com.vishal.spring.mvc.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vishal.spring.mvc.jdbc.bean.Student;
import com.vishal.spring.mvc.jdbc.bean.validator.StudentValidator;
import com.vishal.spring.mvc.jdbc.service.StudentService;

@Controller
public class StudentController {

	StudentValidator studentValidator;
	
	public StudentValidator getStudentValidator() {
		return studentValidator;
	}

	@Autowired
	public void setStudentValidator(StudentValidator studentValidator) {
		this.studentValidator = studentValidator;
	}

	@Autowired
	StudentService studentService;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	private ModelAndView index(@ModelAttribute Student student) {
		// TODO Auto-generated method stub

		ModelAndView model = new ModelAndView("index", "student", student);

		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	private String add(@ModelAttribute Student student, BindingResult result) {

		
		studentValidator.validate(student, result);
		
		if(result.hasErrors()){
			
			return "index";
			
		}else{
			studentService.addStudent(student);
			System.out.println("Add Student");
			return "redirect:/show";
		}
		
		
	}

	@RequestMapping(value = { "/edit", "/find" }, method = { RequestMethod.GET,
			RequestMethod.POST })
	private ModelAndView edit(@RequestParam int id,
			@ModelAttribute Student student) {

		student = studentService.findStudent(id);
		ModelAndView model = new ModelAndView("edit", "student", student);

		return model;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	private String update(@ModelAttribute Student student, BindingResult result) {
		// TODO Auto-generated method stub
		
		studentValidator.validate(student, result);
		
		if(result.hasErrors()){
			
			return "edit";
			
		}else{
			studentService.updateStudent(student);
			System.out.println("Update Student");

			return "redirect:/show";
		}
		
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.GET,
			RequestMethod.POST })
	private String delete(@RequestParam int id) {
		// TODO Auto-generated method stub
		studentService.deleteStudent(id);
		System.out.println("Delete Student");
		return "redirect:/show";
	}

	@RequestMapping(value = "/show")
	private ModelAndView show() {

		List<Student> students = studentService.getStudents();
		ModelAndView model = new ModelAndView("show", "students", students);

		return model;
	}

}
