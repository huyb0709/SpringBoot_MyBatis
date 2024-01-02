package com.training.r.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.r.mapper.DanhSachAllMapper;
import com.training.r.model.DanhSachAll;
@Controller
public class DanhSachController {
	@Autowired DanhSachAllMapper danhSachAllMapper;
	
	@RequestMapping("listAll" )
	public String listAll(Model model) {
		List<DanhSachAll> listDanhSachAll =  danhSachAllMapper.listAll();
		model.addAttribute("danhSachAlls", listDanhSachAll);
		return "listAll";
	}
	
	@RequestMapping("/" )
	public String listAll2(Model model) {
		List<DanhSachAll> listDanhSachAll =  danhSachAllMapper.listAll();
		model.addAttribute("danhSachAlls", listDanhSachAll);
		return "listAll";
	}
}
