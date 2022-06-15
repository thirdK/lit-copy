package com.example.lit.controller;

import com.example.lit.domain.vo.review.ReviewVO;
import com.example.lit.service.LitUpService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/litUp/*")
public class LitUpController {
    private final LitUpService litUpService;



}
