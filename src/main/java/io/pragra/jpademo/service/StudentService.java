package io.pragra.jpademo.service;

import io.pragra.jpademo.JpademoApplication;
import io.pragra.jpademo.entity.Student;
import io.pragra.jpademo.entity.StudentPermit;
import io.pragra.jpademo.repo.StudentPermitRepo;
import io.pragra.jpademo.repo.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepo repo;

    @Autowired
    private StudentPermitRepo studentPermitRepo;

    @Transactional
    public void renCode(){
        StudentPermit permit = StudentPermit.builder().permitName("java full stack").build();
        System.out.println(studentPermitRepo.save(permit));
        Student student = Student.builder().name("shivam").funnyName("saurabh").permit(permit).build();
        System.out.println(repo.save(student));



    }
    @Transactional
    public void runCode2(){
        Optional<Student> byId = repo.findById(2);
        byId.ifPresent(System.out::println);
        log.info("student fetch from database-->{}", byId.get());
        log.info("permit fetch from database-->{}", byId.get().getPermit());
        byId.map(student1 -> student1.getPermit()).ifPresent(System.out::println);
    }
}
