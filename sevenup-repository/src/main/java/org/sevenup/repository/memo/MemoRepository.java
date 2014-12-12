package org.sevenup.repository.memo;

import org.sevenup.domain.memo.Memo;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface MemoRepository extends PagingAndSortingRepository<Memo, String>{
	public void createCollection();
	
	public void dropCollection();
}
