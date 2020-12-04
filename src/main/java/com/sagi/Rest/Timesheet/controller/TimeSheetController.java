package com.sagi.Rest.Timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sagi.Rest.Timesheet.Dto.TimeSheetEntryDto;
import com.sagi.Rest.Timesheet.Service.TimeSheetService;
import com.sagi.Rest.Timesheet.model.TimeSheetEntry;



@RestController
public class TimeSheetController {
	
	@Autowired
	TimeSheetService timeSheetService;
	
	@PostMapping(path="/employee/{eid}")
	public ResponseEntity<Object> saveTimeSheetEntry(@RequestBody List<TimeSheetEntry> timesheets) {
		  
		  //List<TimeSheetEntryDto> timeSheetDtos = new List<TimeSheetEntryDto>(); 
		  //timeSheetService.saveEntry(timeSheetDtos);
		 
			    return new ResponseEntity<>(
			    	      "Good ", 
			    	      HttpStatus.OK);
		
		
		
	}
	
	//@GetMapping(path = "/employee/")
}
