package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Store;
import com.example.demo.repository.StoreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistServiceImpl implements RegistService {
	
	private final StoreRepository repository;
	
	@Override
	public void regist(Store store) {
		
		repository.add(store);
	}

}
