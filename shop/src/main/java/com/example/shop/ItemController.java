package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

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
    // @RequestParam 생략 가능
    @PostMapping("/add")
    // String writePost(@RequestParam String title, @RequestParam Integer price)
    String writePost(@RequestParam Map formData) {
        System.out.println(formData);
        Item item = new Item();
        item.setTitle(formData.get("title").toString());
        item.setPrice(Integer.parseInt(formData.get("price").toString()));
        itemRepository.save(item);
        System.out.println(formData.get("title"));
        return "redirect:/list";
    }
}
// jpa 사용하기
// 1. repository 만들기
// 2. 원하는 클래스에 repository 등록
// 3. repository.문법() 쓰기
