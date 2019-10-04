package com.scott.isurusrestmongoexample.repository;

import com.scott.isurusrestmongoexample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
