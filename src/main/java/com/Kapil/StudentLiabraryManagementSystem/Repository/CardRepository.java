package com.Kapil.StudentLiabraryManagementSystem.Repository;

import com.Kapil.StudentLiabraryManagementSystem.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {

}
