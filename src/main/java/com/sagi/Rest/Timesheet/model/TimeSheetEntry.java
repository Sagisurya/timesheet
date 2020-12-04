package com.sagi.Rest.Timesheet.model;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TimeSheetEntry {
	
	
	private List<TimeCard> timeCard;
	
	private Date date;
	
	private int periodId;

}
