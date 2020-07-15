package org.dgz48.win2cot.reactexerciseserver.domain.book;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book {

	@Id
	private String asin;
	private String title;
	private String amazonUrl;
	private String amazonImageUrl;
}
