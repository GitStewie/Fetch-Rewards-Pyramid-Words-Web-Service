package com.fetchrewards.pyramidword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@SpringBootApplication
@RestController
public class PyramidWords {
	public static void main(String[] args) {
		SpringApplication.run(PyramidWords.class, args);
	}

	@GetMapping("/pyramidWord")
	// Function Evaluates Strings and Returns "%s is a Pyramid Word" or "%s is not a Pyramid Word" when appropriate 
	public String pyramidWord(@RequestParam(value = "word", defaultValue = "banana") String word) {
		// Map each letter to its number of occurences
		HashMap<Character, Integer> letterToOccurences = new HashMap<Character, Integer>();
		// Iterate through string
		for (int i = 0; i < word.length(); i++) {
			if (letterToOccurences.containsKey(word.charAt(i))) { // Increment number of occurences if previous occured
				letterToOccurences.put(word.charAt(i), letterToOccurences.get(word.charAt(i)) + 1);
			} else { // Insert Key into Map
				letterToOccurences.put(word.charAt(i), 1);
			}
		}
		// Declare a Vector
		Vector<Integer> inOrderTestArray = new Vector<Integer>(1);
		// Iterate Through Map
		letterToOccurences.forEach((key, value) -> {
            inOrderTestArray.add(value);
        });
		// Sort Vector the Vector
		Collections.sort(inOrderTestArray);
		for (int i = 1; i < inOrderTestArray.size(); i++) {
			if (inOrderTestArray.elementAt(i) != inOrderTestArray.elementAt(i - 1) + 1) {
				return String.format("%s is not Pyramid Word", word); // Violates Pyramid Word Structure
			}
		}
		return String.format("%s is a Pyramid Word", word); // Conforms to Pyramid Word Structure
	}
}