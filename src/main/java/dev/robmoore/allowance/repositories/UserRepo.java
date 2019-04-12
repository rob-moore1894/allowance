package dev.robmoore.allowance.repositories;

import dev.robmoore.allowance.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
}
