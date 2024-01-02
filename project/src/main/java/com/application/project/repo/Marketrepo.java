package com.application.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.project.entity.Market;
@Repository
public interface Marketrepo extends JpaRepository<Market, Integer> {

}
