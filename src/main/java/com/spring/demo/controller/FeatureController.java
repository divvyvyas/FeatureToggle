package com.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.dao.FeatureDao;
import com.spring.demo.model.Feature;

@RestController
public class FeatureController
{
	@Autowired
	FeatureDao dao;
	
	@GetMapping("/feature")
	@ResponseBody
	public List<Feature> getAllFeature()
	{
		return dao.findAll();
	}
	
	@PostMapping("/feature/add")
	@ResponseBody
	public Feature addFeature(@RequestBody Feature f)
	{
		return dao.save(f);
	}
	
	@GetMapping("/feature/release/{release}")
	@ResponseBody
	public Optional<Feature> getByRelease(@PathVariable("release") double release)
	{
		return dao.findById(release);
	}
	
	@GetMapping("/feature/owner/{owner}")
	@ResponseBody
	public List<Feature> getByOwner(@PathVariable("owner") String owner)
	{
		return dao.findByOwner(owner);
	}
	
	@GetMapping("/feature/dependencies/{dependencies}")
	@ResponseBody
	public List<Feature> getByDependencies(@PathVariable("dependencies") String dependencies)
	{
		return dao.findByDependencies(dependencies);
	}
	
	@GetMapping("/feature/comments/{comments}")
	@ResponseBody
	public List<Feature> getByComments(@PathVariable("comments") String comments)
	{
		return dao.findByComments(comments);
	}
	
	@GetMapping("/feature/on_for/{on_for}")
	@ResponseBody
	public List<Feature> getByOnFor(@PathVariable("on_for") String on_for)
	{
		return dao.findByOnfor(on_for);
	}
	
	@DeleteMapping("/feature/delete/{release}")
	@ResponseBody
	public String deleteFeature(@PathVariable("release") double release)
	{
		dao.deleteById(release);
		return "deleted";
	}
	
	@PutMapping("/feature/update/{release}")
	@ResponseBody
	public Feature update(@RequestBody Feature f)
	{
		dao.delete(f);
		return dao.save(f);
	}
}
