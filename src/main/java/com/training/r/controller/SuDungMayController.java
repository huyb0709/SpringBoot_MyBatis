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
import com.training.r.mapper.KhachHangMapper;
import com.training.r.mapper.MayMapper;
import com.training.r.mapper.SuDungMayMapper;
import com.training.r.model.DichVuExample;
import com.training.r.model.KhachHang;
import com.training.r.model.KhachHangExample;
import com.training.r.model.MayExample;
import com.training.r.model.SuDungMay;
import com.training.r.model.SuDungMayKey;

@Controller
public class SuDungMayController {
	@Autowired SuDungMayMapper suDungMayMapper;
	@Autowired KhachHangMapper khachHangMapper;
	@Autowired MayMapper mayMapper;
	
	@RequestMapping("listComputerRegistration" )
	public String listComputer(Model model ,@RequestParam(name = "keyWord", defaultValue = "") String keyWord) {
		List<SuDungMay> listSuDungMay =  suDungMayMapper.selectByKeyword(keyWord);
		model.addAttribute("suDungMays", listSuDungMay);
		return "listComputerRegistration";
	}
	
	
	@RequestMapping("computerRegistration")
	public String computerRegistration(@ModelAttribute("computerRegis") SuDungMay suDungMay, Model model) {		
		model.addAttribute("computerRegis", suDungMay);
		model.addAttribute("listKH", khachHangMapper.selectByExample(new KhachHangExample()));
		model.addAttribute("listMay",mayMapper.selectByExample(new MayExample()));
		return "addComputerRegistration";
	}
	
	@PostMapping("saveRegisterComputer")
	public String insertcomputerRegistration(@ModelAttribute("computerRegis") SuDungMay suDungMay) {
		suDungMayMapper.insert(suDungMay);
		return "redirect:/listComputerRegistration";
	}
	
	@RequestMapping("updateComputerRegistration") 
	public String showUpdateComputerRegistration(@RequestParam String makh,String mamay,String ngaybatdausudung,String giobatdausudung, Model model) {
		SuDungMay suDungMay = suDungMayMapper.selectByPrimaryKey(new SuDungMayKey(makh,mamay,ngaybatdausudung,giobatdausudung));
		model.addAttribute("computerRegis", suDungMay);
		return "updateComputerRegistration";
	}
	
	@PostMapping("updComputerRegistration")
	public String updateComputerRegistration(@ModelAttribute ("computerRegis") SuDungMay suDungMay) {
		suDungMayMapper.updateByPrimaryKey(suDungMay);
		return "redirect:/listComputerRegistration";
	}
	
	@RequestMapping("deleteComputerRegistration")
	public String deleteComputerRegistration(@RequestParam String makh,String mamay,String ngaybatdausudung,String giobatdausudung, Model model) {
		suDungMayMapper.deleteByPrimaryKey(new SuDungMayKey(makh,mamay,ngaybatdausudung,giobatdausudung));
		return "redirect:/listComputerRegistration";
	}
}
