package com.example.travelplanner.dto;

import org.bson.types.ObjectId;

import com.example.travelplanner.enums.ItineraryStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public record Itinerary(ObjectId id, String username, String description, ItineraryStatus status,
                        Map<Date, List<ItineraryEntry>> entries) {
    public List<ItineraryEntry> getEntryByDate(Date date) {
        return entries.getOrDefault(date, new ArrayList<>());
    }
}
