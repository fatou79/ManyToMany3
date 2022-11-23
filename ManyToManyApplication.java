package com.fatou.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.ManyToMany.entity.Post;
import com.fatou.ManyToMany.entity.Tag;
import com.fatou.ManyToMany.repository.PostRepository;
import com.fatou.ManyToMany.repository.TagRepository;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner{
	
	@Autowired
	private PostRepository postRepository;
	
	
	@Autowired
	private TagRepository tagRepository;
	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Post post1 = new Post("Hibernate One to Many Mapping Example with Spring Boot",
				"Hibernate One to Many Mapping Example with Spring Boot",
				"Hibernate One to Many Mapping Example with Spring Boot");
		
		Tag springBoot = new Tag("Spring Boot");
		Tag hibernate = new Tag("hibernate");
		
		//add tag references post
	//	post.getTags().add(springBoot);
	//	post.getTags().add(hibernate);
		
		//add post reference tag
		
	//	springBoot.getPosts().add(post);
	//	hibernate.getPosts().add(post);
		
		springBoot.getPosts().add(post1);
		post1.getTags().add(springBoot);
		
	//	this.postRepository.save(post);
		this.postRepository.save(post1);

		
	}

}
