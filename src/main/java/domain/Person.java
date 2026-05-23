package domain;

public class Person {

	private int idPerson;
	private String name;
	
	public int getIdPerson() {
		return idPerson;
	}
	
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson; // Đã sửa lỗi chính tả từ "his" thành "this"
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person{" + "idPerson=" + idPerson + ", name=" + name + '}';
	}
}
