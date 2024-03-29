package br.com.salomaotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.salomaotech.model.Student;
import br.com.salomaotech.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Student> getAll() {
		return this.studentService.getAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student student) {
		return this.studentService.create(student);
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Student update(@PathVariable("id") String id, @RequestBody Student student) {
		return this.studentService.update(id, student);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Student delete(@PathVariable("id") String id) {
		return this.studentService.delete(id);
	}

}
