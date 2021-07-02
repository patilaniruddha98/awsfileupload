package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.MyFiles;

public interface FileRepository extends JpaRepository<MyFiles,Integer> {

}
