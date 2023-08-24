package com.coderscampus.assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment10.service.SpoonacularIntegrationService;
import com.coderscampus.assignment10.spoonacular.dto.DayResponse;
import com.coderscampus.assignment10.spoonacular.dto.WeekResponse;



@RestController
public class RecipeController {
	
	@Autowired
	private SpoonacularIntegrationService spoonacularIntegrationService;
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		ResponseEntity<WeekResponse> weekResponse = spoonacularIntegrationService.callWeekApi();
		return weekResponse;
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
		ResponseEntity<DayResponse> dayResponse = spoonacularIntegrationService.callDayApi();
		return dayResponse;
	}

}
  // figure out method params
  // When i call the day end point, i'm just given one day and it doesn't even tell me the day. Is that expected?
