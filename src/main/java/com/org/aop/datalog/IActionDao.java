package com.org.aop.datalog;

import com.org.aop.domain.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by KaBu on 2018/11/6.
 */
public interface IActionDao extends MongoRepository<Action,String> {
}
