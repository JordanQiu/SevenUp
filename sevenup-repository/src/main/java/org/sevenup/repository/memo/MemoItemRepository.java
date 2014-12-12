package org.sevenup.repository.memo;

import org.sevenup.domain.memo.MemoItem;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface MemoItemRepository extends MongoRepository<MemoItem,Long>{
	public void createCollection();
	
	public void dropCollection();
}
