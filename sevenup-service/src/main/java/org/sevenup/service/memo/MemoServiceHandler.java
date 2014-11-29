package org.sevenup.service.memo;

import java.util.List;

import org.sevenup.repository.memo.Memo;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
@Service
public class MemoServiceHandler implements MemoService{

	@Override
	public List<Memo> findMemos() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
