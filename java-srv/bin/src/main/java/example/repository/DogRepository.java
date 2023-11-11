package example.repository;

import com.arangodb.springframework.annotation.Query;
import com.arangodb.springframework.repository.ArangoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import example.model.Dog;

@Repository
public interface DogRepository extends ArangoRepository<Dog, String>{
    Iterable<Dog> findByBreed(String breed);
    Iterable<Dog> findByColor(String color);

/*
    @Query("FOR a IN articles FILTER a.author == @author SORT a.publishDate ASC RETURN a")
    Iterable<Article> getByAuthor(@Param("author") String author);

    @Query("FOR a IN articles FILTER a.author == @author SORT a.publishDate ASC RETURN a")
    Iterable<Article> getByAuthor(@Param("author") String author);
*/
}
