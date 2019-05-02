package com.example.demo;





import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;



public class SequenceGenrator {
	
	
	@Autowired
	private MongoOperations mongoOperations;
	
	public long generateSequence(String seqName)
	{
		Users counter=mongoOperations.findAndModify(query(where("_UserID").is(seqName)),
				new Update().inc("Seq",1), options().returnNew(true).upsert(true),Users.class);
	
	return counter.getSeq();
	}

}
