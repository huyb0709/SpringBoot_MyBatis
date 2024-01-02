package com.training.r.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.r.mapper.DichVuMapper;
import com.training.r.model.DichVu;

@Controller
public class DichVuController {
	
	@Autowired DichVuMapper dichVuMapper;
	
	@RequestMapping("listServices")
	public String listServices(Model model ,@RequestParam(name = "keyWord", defaultValue = "") String keyWord) {
		List<DichVu> listDichVu =  dichVuMapper.selectByKeyword(keyWord);
		model.addAttribute("dichVus", listDichVu);
		return "listServices";
	}
	
	@RequestMapping("addServices")
	public String addServices(@ModelAttribute("maDV") DichVu dichVu, Model model) {		
		model.addAttribute("maDV", dichVu);
		return "addServices";
	}
	
	@PostMapping("saveServices")
	public String insertCustomers(@ModelAttribute("maDV") DichVu dichVu) {
		dichVuMapper.insert(dichVu);
		return "redirect:/listServices";
	}
	
	@RequestMapping("updateServices") 
	public String showUpdateServices(@RequestParam String madv, Model model) {
		DichVu dichVu = dichVuMapper.selectByPrimaryKey(madv);
		model.addAttribute("maDV", dichVu);
		return "updateServices";
	}
	
	@PostMapping("updServices")
	public String updateServices(@ModelAttribute ("maDV") DichVu dichVu) {
		dichVuMapper.updateByPrimaryKey(dichVu);
		return "redirect:/listServices";
	}
	
	@RequestMapping("deleteServices")
	public String deleteServices(@RequestParam String madv, Model model) {
		dichVuMapper.deleteByPrimaryKey(madv);
		return "redirect:/listServices";
	}
}
