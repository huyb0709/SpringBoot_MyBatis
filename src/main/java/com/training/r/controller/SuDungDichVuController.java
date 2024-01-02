package com.training.r.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.r.mapper.SuDungDichVuMapper;
import com.training.r.model.SuDungDichVu;
import com.training.r.model.SuDungDichVuKey;
import com.training.r.model.SuDungMay;
import com.training.r.model.SuDungMayKey;

@Controller
public class SuDungDichVuController {
	@Autowired SuDungDichVuMapper suDungDichVuMapper;
	
	@RequestMapping("listServiceRegistration" )
	public String listServiceRegistration(Model model ,@RequestParam(name = "keyWord", defaultValue = "") String keyWord) {
		List<SuDungDichVu> listSuDungDichVu =  suDungDichVuMapper.selectByKeyword(keyWord);
		model.addAttribute("suDungDichVus", listSuDungDichVu);
		return "listServiceRegistration";
	}
	
	@RequestMapping("serviceRegistration")
	public String serviceRegistration(@ModelAttribute("serviceRegis") SuDungDichVu suDungDichVu, Model model) {		
		model.addAttribute("serviceRegis", suDungDichVu);
		return "addServiceRegistration";
	}
	
	@PostMapping("saveRegisterService")
	public String insertServiceRegistration(@ModelAttribute("serviceRegis") SuDungDichVu suDungDichVu) {
		suDungDichVuMapper.insert(suDungDichVu);
		return "redirect:/listServiceRegistration";
	}
	@RequestMapping("updateServiceRegistration") 
	public String showUpdateServiceRegistration(@RequestParam String madv,String makh,String ngaysudung,String giosudung, Model model) {
		SuDungDichVu suDungDichVu = suDungDichVuMapper.selectByPrimaryKey(new SuDungDichVuKey(madv,makh,ngaysudung,giosudung));
		model.addAttribute("serviceRegis", suDungDichVu);
		return "updateServiceRegistration";
	}
	
	@PostMapping("updServiceRegistration")
	public String updateComputerRegistration(@ModelAttribute ("serviceRegis") SuDungDichVu suDungDichVu) {
		suDungDichVuMapper.updateByPrimaryKey(suDungDichVu);
		return "redirect:/listServiceRegistration";
	}
	
	@RequestMapping("deleteServiceRegistration")
	public String deleteComputerRegistration(@RequestParam String madv,String makh,String ngaysudung,String giosudung, Model model) {
		suDungDichVuMapper.deleteByPrimaryKey(new SuDungDichVuKey(madv,makh,ngaysudung,giosudung));
		return "redirect:/listServiceRegistration";
	}
}
