package com.sagi.Rest.Timesheet.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sagi.Rest.Timesheet.Dto.TimeSheetEntryDto;
import com.sagi.Rest.Timesheet.model.TimeSheetEntry;

@Repository
public interface TimeSheetRepository extends CrudRepository<TimeSheetEntryDto, Long>{


}
