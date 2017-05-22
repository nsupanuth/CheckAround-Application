package com.example.checkaround.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.checkaround.model.Checkins;
import com.example.checkaround.repository.CheckinRepository;

@Service
public class LocationService {

	@Autowired
	private CheckinRepository checkinRepository;

	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
		return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

	public List<Checkins> showListOflocations() {
		List<Checkins> locations = checkinRepository.findAll();
		return locations.stream().filter(distinctByKey(l->l.getLocationName()))
				.collect(Collectors.toList());
	}
}
