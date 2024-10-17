package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "JOBS")
public class JobsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private String JOBID;
	private String JOBTITLE;
	private int MINSALARY;
	private int MAXSALARY;

	public String getJOBID() {
		return JOBID;
	}

	public void setJOBID(String jOBID) {
		JOBID = jOBID;
	}

	public String getJOBTITLE() {
		return JOBTITLE;
	}

	public void setJOBTITLE(String jOBTITLE) {
		JOBTITLE = jOBTITLE;
	}

	public int getMINSALARY() {
		return MINSALARY;
	}

	public void setMINSALARY(int mINSALARY) {
		MINSALARY = mINSALARY;
	}

	public int getMAXSALARY() {
		return MAXSALARY;
	}

	public void setMAXSALARY(int mAXSALARY) {
		MAXSALARY = mAXSALARY;
	}

}
