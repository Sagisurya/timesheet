package com.sagi.Rest.Timesheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagi.Rest.Timesheet.Dto.TimeSheetEntryDto;
import com.sagi.Rest.Timesheet.Repository.TimeSheetRepository;

@Service
public class TimeSheetService {
	
	@Autowired
	public TimeSheetRepository timeSheetRepository;
	
	public void saveEntry(List<TimeSheetEntryDto> timeSheetEntryDto) {
		 timeSheetRepository.saveAll(timeSheetEntryDto);
	}
}
