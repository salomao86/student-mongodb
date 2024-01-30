package br.com.salomaotech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.salomaotech.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
