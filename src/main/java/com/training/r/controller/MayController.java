package com.training.r.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.r.mapper.MayMapper;
import com.training.r.model.May;

@Controller
public class MayController {
	@Autowired MayMapper mayMapper;
	
	@RequestMapping("listComputers" )
	public String listComputer(Model model ,@RequestParam(name = "keyWord", defaultValue = "") String keyWord) {
		List<May> listMay =  mayMapper.selectByKeyword(keyWord);
		model.addAttribute("mays", listMay);
		return "listComputers";
	}
	
	@RequestMapping("addComputers")
	public String addComputer(@ModelAttribute("maMay") May may, Model model) {		
		model.addAttribute("maMay", may);
		return "addComputers";
	}
	
	@PostMapping("saveComputer")
	public String insertComputer(@Valid @ModelAttribute ("maMay") May may, BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			return "addComputers";
		}else {
				int result = mayMapper.insert(may);
				if(result > 0) {
					System.out.println("Insert thanh cong !");
				}else {
					System.out.println("Insert that bai !");
			}
				return "redirect:/listComputers";
		}
	}
	
	@RequestMapping("updateComputers") 
	public String showUpdateComputer(@RequestParam String mamay, Model model) {
		May may = mayMapper.selectByPrimaryKey(mamay);
		model.addAttribute("maMay", may);
		return "updateComputers";
	}
	
	@PostMapping("updComputer")
	public String updateComputer(@ModelAttribute ("maMay") May may) {
		mayMapper.updateByPrimaryKey(may);
		return "redirect:/listComputers";
	}
	
	@RequestMapping("deleteComputers")
	public String deleteKhachHang(@RequestParam String mamay, Model model) {
		mayMapper.deleteByPrimaryKey(mamay);
		return "redirect:/listComputers";
	}
	
	/*
	 * @RequestMapping("SearchComputers") public String selectByKeyword(Model model,
	 * String keyWord) { List<May> listMay = mayMapper.selectByKeyword(keyWord);
	 * model.addAttribute("mays", listMay); return "listComputers"; }
	 */
	
}
