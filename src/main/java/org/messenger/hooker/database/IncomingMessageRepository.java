package org.messenger.hooker.database;

import org.messenger.hooker.models.IncomingMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface IncomingMessageRepository extends CrudRepository<IncomingMessage, Integer> {

}