package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor // 롬북 문법, private final ItemRepository itemRepository; 이걸 쓰기 위한 문법
// 이거하면 itemRepository가 등록되고 이 변수에 db 입출력 함수들이 막 들어있게 된다.
// 이거 안 쓰면 아래처럼 생성자 만들고 Autowired 해야함
public class ItemController {

    private final ItemRepository itemRepository;
    
//    @Autowired
//    public ItemController(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//    }

    @GetMapping("/list")
    String list(Model model) {
        // model.addAttribute("전달할 데이터 이름", "데이터")
        List<Item> result = itemRepository.findAll();

        // 룸북 기능 -> @ToString 애너테이션 : 객체 멤버를 보여주는 toString() 메서드 지원
        // 룸북 없이 toString() 출력하면 이상한 문자열 나옴
        System.out.println(new Item().toString());
        model.addAttribute("items", result);
        return "list.html";
    }

    @GetMapping("/write")
    String write(Model model) {
        return "write.html";
    }

    // url 작명은 동사보다는 명사로 하는 게 좋음
    @PostMapping("/add")
    // String writePost(@RequestParam String title, @RequestParam Integer price)
    String writePost(@ModelAttribute Item item) {
        System.out.println(item);
        itemRepository.save(item);
        return "redirect:/list";
    }

    // id를 url 파라미터라고 부름
    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id, Model model) {
        Optional<Item> result = itemRepository.findById(id);
        // Optional 타임은 이 변수가 비어있을 수도 있고 Item 타입일 수도 있다는 뜻
        // 결과가 없는 경우를 대비하기 위한 타입
        // 이 변수의 값을 쓸 때는 .get()을 써야 함
        if (result.isPresent()) {
            // result 값 없는데 get하면 오류 남
            System.out.println(result.get());
            model.addAttribute("item", result.get());
        } else {
            return "redirect:/list";
        }
        return "detail.html";
    }
}
// jpa 사용하기
// 1. repository 만들기
// 2. 원하는 클래스에 repository 등록
// 3. repository.문법() 쓰기
