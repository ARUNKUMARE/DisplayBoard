package in.co.irctc.displayboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.co.irctc.displayboard.entity.Train;

public interface TrainRepository extends MongoRepository<Train, ID>{

}
