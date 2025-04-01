package com.example.travelplanner.dto;

import org.bson.types.ObjectId;

import java.sql.Timestamp;

// Note: if an activity takes multiple days, then i.e. if 2 days, then day 1 end date is 11:59pm, day 2 start is midnight
public record ItineraryEntry (ObjectId id, Timestamp start, Timestamp end, String description, String location) {}
