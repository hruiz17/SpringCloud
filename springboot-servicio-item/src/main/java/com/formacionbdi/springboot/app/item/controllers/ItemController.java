package com.formacionbdi.springboot.app.item.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.item.models.Item;

@RestController
public class ItemController {

	@GetMapping("/listar")
	public List<Item> listar() {
		return new ArrayList<Item>();
	}

	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return new Item();
	}
}
