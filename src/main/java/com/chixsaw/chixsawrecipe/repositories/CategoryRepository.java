package com.chixsaw.chixsawrecipe.repositories;

import com.chixsaw.chixsawrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Raphael Frey on 26.11.2022
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
