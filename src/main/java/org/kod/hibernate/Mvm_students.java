package org.kod.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mvm_students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sid;
	private String Sname;
	private Certificate certificate;
	public Mvm_students(int sid, String sname, Certificate certificate) {
		super();
		Sid = sid;
		Sname = sname;
		this.certificate = certificate;
	}
	public Mvm_students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Mvm_students [Sid=" + Sid + ", Sname=" + Sname + ", certificate=" + certificate + "]";
	}
	
	

	
	

}
