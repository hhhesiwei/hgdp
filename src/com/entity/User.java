package com.entity;

public class User {
	private String name;
	private String words;
	private int age;
	public User(){}
	public User(String name){
		this.name = name;
	}
	public User(String name,int age){
		this.name = name;
		this.age = age;
	}
	public User(String name,String words){
		this.name = name;
		this.words = words;
	}
	public User(String name,String words,int age){
		this.name = name;
		this.words = words;
		this.age = age;
	}
	/**
	 * 执行说的方法
	 */
	public void say(){
		System.out.println(name+"说：我今年" + age + "岁");
		System.out.println(name+"说：" + words);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
