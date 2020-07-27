package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.model.Book;


	public interface BookRepository extends JpaRepository<Book, Integer>{

		@Modifying
		@Query("delete from Book where id=:id")
		public int deleteById(@Param("id")int id);
		
		@Query("select b from Book b WHERE b.title=:title AND b.author=:author")
		public Book getByTitleAndAuthor(String title, String author);
	}
