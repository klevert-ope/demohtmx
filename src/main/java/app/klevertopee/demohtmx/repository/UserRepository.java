package app.klevertopee.demohtmx.repository;

import app.klevertopee.demohtmx.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
