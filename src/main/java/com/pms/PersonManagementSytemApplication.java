package com.pms;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pms.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

@SpringBootApplication
public class PersonManagementSytemApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersonManagementSytemApplication.class, args);
		try {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Person>> typeReference= new TypeReference <List<Person>>() {};
			//InputStream inputStream = TypeReference.class.getResourceAsStream("/json/person.json");
			InputStream inputStream= new FileInputStream(new File("C:\\STS\\PersonManagementSytem\\src\\main\\resources\\json\\person.json"));
			List<Person> personList = mapper.readValue(inputStream,typeReference);
			for(Person p : personList ){
				System.out.println("id is "+ p.getId() + " first name is  "+ p.getFirstname() + " latname is " + p.getLastname()+ "   address is "+ p.getAddress());

			}
		Person person = new Person();
		person.setId(1);
		person.setFirstname("Keerthi");
		person.setLastname("Ram");
		person.setAddress("Bangalore, Karnataka");
		mapper.writeValue(new File("C:\\STS\\PersonManagementSytem\\src\\main\\resources\\json\\writingperson.json"),person);
		inputStream.close();

	}
		catch (IOException e ){
			e.printStackTrace();
		}
	}

}
