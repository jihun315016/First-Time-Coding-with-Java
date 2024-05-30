package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private Map<Integer, String> db = new HashMap<>();
    private int id = 1;

    public String findProduct(int idx) {
        // Map에서 get 메서드는 있으면 있는거고 없으면 없는거고 하는거
        // 이런 경우엔 예외 처리를 해주면 좋다. (없는 키)
        return db.get(idx);
    }

    public void save(String productName) {
        db.put(id++, productName);
    }
}
