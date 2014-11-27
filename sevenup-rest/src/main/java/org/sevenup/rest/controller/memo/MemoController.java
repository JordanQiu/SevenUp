package org.sevenup.rest.controller.memo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sevenup.rest.domain.memo.Memo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Produces(MediaType.APPLICATION_JSON)
public class MemoController {
	@RequestMapping(value ="/memos",method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Memo> getMemos() {
		List<Memo> MemoList = new ArrayList<Memo>();
		for (int i = 0; i < 10; i++) {
			Memo tempMemo = new Memo();
			tempMemo.setTitle("Title-"+i);
			MemoList.add(tempMemo);
		}
		return MemoList;
	}
}
