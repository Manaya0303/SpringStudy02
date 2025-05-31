package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Store;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryImpl implements StoreRepository {
	
	private final JdbcTemplate jdbcTemplate;
	@Override
	public void add(Store store) {
		
		String sql = 
				"INSERT INTO m_restaurant" +
				"(restaurant_name, catch_phrase) " +
				"VALUES (?, ?)";
		jdbcTemplate.update(sql, store.getRestaurantName(),
								 store.getCatchPhrase()		);
	}
	
}
