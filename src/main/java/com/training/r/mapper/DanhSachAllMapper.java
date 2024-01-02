package com.training.r.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.training.r.model.DanhSachAll;

@Mapper
public interface DanhSachAllMapper {
	List<DanhSachAll> listAll();
}

