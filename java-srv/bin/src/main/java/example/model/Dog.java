package example.model;

import lombok.*;

import com.arangodb.springframework.annotation.ArangoId;
import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.Id;

@Document("animal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    
    @Id
    private String id;
/*
    @ArangoId
    private String arangoId;
*/    
    private String breed;
    private String color;
}
