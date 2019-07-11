package model;

public class Student {
	private String name;//姓名
	private int age;//年龄
	private String sex;//性别
	private String xuehao;//学号
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", xuehao=" + xuehao + "]";
	}
	

}
