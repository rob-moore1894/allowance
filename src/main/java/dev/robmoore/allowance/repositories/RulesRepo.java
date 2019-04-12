package dev.robmoore.allowance.repositories;

import dev.robmoore.allowance.models.Rules;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulesRepo extends CrudRepository<Rules, Long> {
}
