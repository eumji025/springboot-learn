package com.eumji.mybatisxml.service.impl;

import com.eumji.mybatisxml.mapper.UserInfoMapper;
import com.eumji.mybatisxml.service.User2Service;
import com.eumji.mybatisxml.vo.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class User2ServiceImpl implements User2Service {
	@Autowired
	private UserInfoMapper userInfoMapper;


	/**
	 * 如果是调用这个方法的抛出了异常是不受影响的，因为当前方法结束的时候就会被提交的
	 *
	 * 原理是这里会挂起原来的事务，而执行现在的时候，如果正常的结束，则提交当前事务，还原上一层的事务
	 *
	 * 如果当前的事务异常回滚，则还原的上一层事务也会回滚
	 * @param userInfo
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public void insertUser(UserInfo userInfo) {
		userInfoMapper.insertUser(userInfo.getName()+"requires_new",userInfo.getSex());
		int a = 1/0;

	}


	/**
	 * 嵌套事务的实现
	 * 无论是在当前方法还是 在上次调用方法里发生异常都会回滚，因为他会使用savepoint暂存当前的状态， 只有上次没问题的时候才会提交，
	 * 如果存在问题通过savepoint进行回滚
	 * @param userInfo
	 */
	@Transactional(propagation = Propagation.NESTED)
	@Override
	public void insertUser2(UserInfo userInfo) {
		userInfoMapper.insertUser(userInfo.getName()+"nested",userInfo.getSex());
		int i = 1 /0;
	}
}
