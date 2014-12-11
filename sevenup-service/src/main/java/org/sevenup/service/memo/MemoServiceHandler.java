package org.sevenup.service.memo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.sevenup.domain.memo.Memo;
import org.sevenup.domain.memo.MemoItem;
import org.sevenup.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;
@Service
public class MemoServiceHandler implements MemoService{
//    private final Repository memoResoitory;
//    private final Repository memoItemResoitory;
//    @Autowired
//    public MemoServiceHandler(Repository memoResoitory,Repository memoItemResoitory) {
//        this.memoResoitory = memoResoitory;
//        this.memoItemResoitory = memoItemResoitory;
//    }
	@Override
	public Memo findMemo() {
		Memo memo = new Memo();
		List<MemoItem> memoItems = new ArrayList<MemoItem>();
		MemoItem temp = new MemoItem();
		for (int j = 0; j < 5; j++) {
			MemoItem item = new MemoItem();
			item.setCreatedTime(new Date());
			item.setContent("I am the desc " + j);
			item.setDeadlineTime(new Date());
			item.setTitle("Title " + j);
			memoItems.add(item);
		}
		memo.setItems(memoItems);
		return memo;
	}

	@Override
	public MemoItem findMemoItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
