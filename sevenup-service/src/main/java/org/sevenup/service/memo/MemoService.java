package org.sevenup.service.memo;

import org.sevenup.domain.memo.Memo;
import org.sevenup.domain.memo.MemoItem;
import org.springframework.dao.DataAccessException;

public interface MemoService {
	public Memo findMemo();
	public MemoItem findMemoItem();
}
