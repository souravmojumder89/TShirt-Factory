package com.sapient.saurav.repository;

import com.sapient.saurav.domain.Tshirt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TshirtRepository extends CrudRepository<Tshirt,Long> {
}
