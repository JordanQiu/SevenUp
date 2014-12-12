package org.sevenup.repository.memo;

import java.util.List;

import org.sevenup.domain.memo.MemoItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class MemoItemRepositoryHandler implements MemoItemRepository{

	@Override
	public List<MemoItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemoItem> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MemoItem> List<S> save(Iterable<S> sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<MemoItem> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MemoItem> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemoItem findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<MemoItem> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemoItem entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends MemoItem> entities) {
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
