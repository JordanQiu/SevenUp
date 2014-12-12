package org.sevenup.repository.memo;

import java.util.List;

import org.sevenup.domain.memo.Memo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
@Repository
public class MemoRepositoryHandler implements MemoRepository{

	@Override
	public List<Memo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Memo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Memo> List<S> save(Iterable<S> memos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Memo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Memo> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Memo findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Memo> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Memo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Memo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCollection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropCollection() {
		// TODO Auto-generated method stub
		
	}

}
