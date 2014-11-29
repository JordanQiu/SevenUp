package org.sevenup.rest.controller.memo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.sevenup.rest.domain.memo.Memo;
import org.sevenup.rest.domain.memo.MemoItem;
import org.sevenup.service.memo.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memos")
public class MemoController {
	@Autowired
	private MemoService memoService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Memo> getMemos() {
		List<Memo> MemoList = new ArrayList<Memo>();
		// memoService.findMemos();
		for (int i = 0; i < 10; i++) {
			Memo temp = new Memo();
			temp.setDateTimeOfSubmission(new Date());
			temp.setKey(UUID.randomUUID());
			List<MemoItem> items = new ArrayList<MemoItem>();
			// for(int j=0;j<5;j++){
			// MemoItem item = new MemoItem();
			// item.setDateTimeOfSubmission(new Date());
			// item.setDescription("I am the desc "+j);
			// item.setKey(UUID.randomUUID());
			// item.setTitle("Title "+j);
			// items.add(item);
			// }
			// temp.setItems(items);
			MemoList.add(temp);
		}
		return MemoList;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Memo getMemoById(@PathVariable String id) {
		Memo memo = new Memo();
		List<MemoItem> memoItems = new ArrayList<MemoItem>();
		MemoItem temp = new MemoItem();
		temp.setDateTimeOfSubmission(new Date());
		temp.setKey(UUID.randomUUID());
		for (int j = 0; j < 5; j++) {
			MemoItem item = new MemoItem();
			item.setDateTimeOfSubmission(new Date());
			item.setDescription("I am the desc " + j);
			item.setKey(UUID.randomUUID());
			item.setTitle("Title " + j);
			memoItems.add(item);
		}
		memo.setItems(memoItems);
		return memo;
	}
}
