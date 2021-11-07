package com.adl.main.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="bonus")
public class BonusModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int worker_ref_id;
	private Date bonus_date;
	private int bonus_amount;
	

}
