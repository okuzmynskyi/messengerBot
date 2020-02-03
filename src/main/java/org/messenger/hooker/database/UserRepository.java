package org.messenger.hooker.database;

import org.messenger.hooker.models.viber.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}