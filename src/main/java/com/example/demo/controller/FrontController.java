package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.IndexForm;

@Controller
public class FrontController {
	@RequestMapping({ "/", "/index" })
	public String index(@ModelAttribute("indexForm") IndexForm form) {
		return "index";
	}

	@RequestMapping("/regist")
	public String regist(@ModelAttribute("indexForm") @Validated IndexForm form, BindingResult result) {

		System.out.println("regist");
		System.out.println("テスト");

		return "index";
	}
}
