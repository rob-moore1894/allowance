package dev.robmoore.allowance.repositories;

import dev.robmoore.allowance.models.Child;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepo extends CrudRepository<Child, Long> {
}
