package com.example.demo.product;

import org.springframework.stereotype.Service;

@Service // Service 나오는 거 보니까 얘또 해주면 좋을 것 같아요.
public class ProductService {
    public String findProduct() {
        return "Notebook!";
    }
}
