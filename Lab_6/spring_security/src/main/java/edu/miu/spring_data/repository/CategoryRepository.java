package edu.miu.spring_data.repository;

import edu.miu.spring_data.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
}
