/***********************************************************************
 *
 * 没有描述
 *
 * batch_sample 1.0源代码拷贝权属北京四达时代软件技术有限公司所有，
 * 受到法律的保护，任何公司或个人，未经授权不得擅自拷贝。
 *
 * @copyright   Copyright: 2002-2006 Beijing Startimes
 *              Software Technology Co. Ltd.
 * @creator     liugr liugr@startimes.com.cn <br/>
 * @create-time 下午12:28:03
 * @revision    $Id$
 *
 ***********************************************************************/
package org.springframework.batch.sample;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class MessagesItemWriter implements ItemWriter<Message>{

	public void write(List<? extends Message> messages) throws Exception {
		System.out.println("write results");
		for (Message m : messages) {
			System.out.println(m.getContent());
		}
	}
}
