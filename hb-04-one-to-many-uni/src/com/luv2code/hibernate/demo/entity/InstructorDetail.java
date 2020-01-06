package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="you_tube_channel")
	private String youTubeChannel;
	
	@Column(name="hobby")
	private String hobby;
	
	public InstructorDetail() {}
	
	public InstructorDetail(String you_tube_channel, String hobby) {
		this.youTubeChannel = you_tube_channel;
		this.hobby = hobby;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getYou_tube_channel() {
		return youTubeChannel;
	}

	public void setYou_tube_channel(String you_tube_channel) {
		this.youTubeChannel = you_tube_channel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [Id=" + Id + ", you_tube_channel=" + youTubeChannel + ", hobby=" + hobby + "]";
	}
	
	

}
