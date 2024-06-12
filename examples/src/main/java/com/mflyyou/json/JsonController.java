package com.mflyyou.json;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/json")
@RequiredArgsConstructor
public class JsonController {
    private final BookMapper mapper;

    @GetMapping("/{id}")
    public BookEntity demo(@PathVariable Long id) {
        return mapper.selectById(id);
    }

    @PostMapping("")
    public Long demo(@RequestBody BookEntity user) {
        mapper.insert(user);
        return user.getId();
    }

    @GetMapping("/all")
    public List<BookDomain> all() {
        return mapper.selectAll();
    }

    @GetMapping("/all1")
    public List<BookDomain1> all1() {
        return mapper.selectAll1();
    }

    @GetMapping("/all2")
    public List<BookDomain2> all2() {
        return mapper.selectAll2();
    }

    @GetMapping("/all3")
    public List<BookDomain3> all3() {
        return mapper.selectAll3();
    }

}
