package com.sethanantp.spring5webapp.repositories;

import com.sethanantp.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
