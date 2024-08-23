package com.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeDesignPattern {
	private String name;
	private Integer id;
	private Double salery;
	private String branch;

	List<CompositeDesignPattern> list=null;
	public CompositeDesignPattern(String name, Integer id, Double salery, String branch) {
		this.name = name;
		this.id = id;
		this.salery = salery;
		this.branch = branch;
		this.list=new ArrayList<CompositeDesignPattern>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalery() {
		return salery;
	}

	public void setSalery(Double salery) {
		this.salery = salery;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void add(CompositeDesignPattern c) {
		list.add(c);
	}
	
	public void removeBranch(CompositeDesignPattern c) {
		list.remove(c);
	}
	
	void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}

}
