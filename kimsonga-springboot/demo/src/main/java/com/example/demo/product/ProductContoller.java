package com.example.demo.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 그냥 화면(뷰)를 던져주는 API가 되는 것
@ResponseBody // response body에 답아서 데이터를 돌려주는 REST API
public class ProductContoller {
    // "사용자가 요청을 던지면" 그걸 받아서
    // 요청에 맞는 메서드를 실행시킨다.
    // 그 안에서, 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬거예요.
    // -> 요청을 던지면 받아내는 역할

    // 핸들러
    // 요청이 날아오면 그 요청에 맞는 메서드를 호출해주는 것, 그 호출 당하는 메서드
    // == 요청에 따른 메서드 호출


    // 상품 조회
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String findProduct() {
        // 현재 화면이 아니라 데이터를 던지는 상황
        // 데이터를 던진다는 것은 그냥 API가 아니라 REST API
        // REST API는 reponse body라고 하는 그 body에다가

        ProductService productService = new ProductService();
        return productService.findProduct();
    }
}
