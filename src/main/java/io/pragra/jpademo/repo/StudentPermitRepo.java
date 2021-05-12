package io.pragra.jpademo.repo;

import io.pragra.jpademo.entity.StudentPermit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPermitRepo extends JpaRepository<StudentPermit, Integer> {
}
