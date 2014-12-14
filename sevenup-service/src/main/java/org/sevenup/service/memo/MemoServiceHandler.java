package org.sevenup.service.memo;


import org.sevenup.domain.memo.Memo;
import org.sevenup.domain.memo.MemoItem;
import org.sevenup.repository.memo.MemoItemRepository;
import org.sevenup.repository.memo.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MemoServiceHandler implements MemoService{
	@Autowired
	private  MemoRepository memoRepository;
	@Autowired
	private  MemoItemRepository memoItemRepository;
	
	MemoServiceHandler(){
		memoRepository.createCollection();
		memoItemRepository.createCollection();
	}
	@Override
	public Memo findMemo() {
		memoRepository.findOne("222");
		memoItemRepository.findAll();
		return memoRepository.findOne("222");
	}

	@Override
	public MemoItem findMemoItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
