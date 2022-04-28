package com.example.ifaces;

import java.util.List;
import java.util.Optional;

import com.example.entity.LoanApplication;

public interface CrudRespository <T>{
	public int add(T obj);
	public List<T> findAll();
	public Optional<T> findById (int id);

}