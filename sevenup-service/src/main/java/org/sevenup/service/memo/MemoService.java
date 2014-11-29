package org.sevenup.service.memo;

import java.util.List;

import org.sevenup.repository.memo.Memo;
import org.springframework.dao.DataAccessException;

public interface MemoService {
    List<Memo> findMemos() throws DataAccessException;
}
