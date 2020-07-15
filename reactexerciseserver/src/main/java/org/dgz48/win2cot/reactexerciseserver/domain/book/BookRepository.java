package org.dgz48.win2cot.reactexerciseserver.domain.book;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.validation.annotation.Validated;

@Validated
@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends PagingAndSortingRepository<Book, String> {


}
