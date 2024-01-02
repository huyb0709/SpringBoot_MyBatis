package com.training.r.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.r.mapper.KhachHangMapper;
import com.training.r.model.KhachHang;

@Controller
public class KhachHangController {
	@Autowired KhachHangMapper khachHangMapper;
	
	
	@RequestMapping("listCustomers")
	public String listCustomer(Model model ,@RequestParam(name = "keyWord", defaultValue = "") String keyWord) {
		List<KhachHang> listKhachHang =  khachHangMapper.selectByKeyword(keyWord);
		model.addAttribute("khachHangs", listKhachHang);
		return "listCustomers";
	}
	
	@RequestMapping("addCustomers")
	public String addCustomers(@ModelAttribute("maKH") KhachHang khachHang, Model model) {		
		model.addAttribute("maKH", khachHang);
		return "addCustomers";
	}
	
	@PostMapping("saveCustomers")
	public String insertCustomers(@ModelAttribute ("maKH") KhachHang khachHang) {
		khachHangMapper.insert(khachHang);
		return "redirect:/listCustomers";
	}
	
	@RequestMapping("updateCustomers") 
	public String showUpdateCustomers(@RequestParam String makh, Model model) {
		KhachHang khachHang = khachHangMapper.selectByPrimaryKey(makh);
		model.addAttribute("maKH", khachHang);
		return "updateCustomers";
	}
	
	@PostMapping("updCustomers")
	public String updateCustomers(@ModelAttribute ("maKH") KhachHang khachHang) {
		khachHangMapper.updateByPrimaryKey(khachHang);
		return "redirect:/listCustomers";
	}
	
	@RequestMapping("deleteCustomers")
	public String deleteCustomers(@RequestParam String makh, Model model) {
		khachHangMapper.deleteByPrimaryKey(makh);
		return "redirect:/listCustomers";
	}
	
}
