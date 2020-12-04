package com.sagi.Rest.Timesheet.Dto;

import java.sql.Date;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "ts")
@Getter
@Setter
public class TimeSheetEntryDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private int employeeId;
	
	private Date date;
	
	@ElementCollection
    @CollectionTable(name = "ts_hrs_mapping", 
      joinColumns = {@JoinColumn(name = "ts_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "prj_code")
    @Column(name = "hrs")
	
	private Map<String, Double> timeEntry;
	
	

}