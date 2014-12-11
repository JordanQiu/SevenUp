package org.sevenup.rest.controller.memo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.sevenup.domain.memo.Memo;
import org.sevenup.domain.memo.MemoItem;
import org.sevenup.service.memo.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/memo")
public class MemoController {
	@Autowired
	private MemoService memoService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Memo getMemo() {
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
	
    @RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Memo> createMemo(@RequestBody Memo memo, UriComponentsBuilder builder) {
    	UUID id = UUID.randomUUID();
    	System.out.println(memo.getTitle()+"---nonumber1989");
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/memo/{id}").buildAndExpand(id.toString()).toUri());
        return new ResponseEntity<Memo>(memo, headers, HttpStatus.CREATED);
	}
	
}
