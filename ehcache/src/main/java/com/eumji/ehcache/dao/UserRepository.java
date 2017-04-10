package com.eumji.ehcache.dao;

import com.eumji.ehcache.vo.User;
import org.hibernate.annotations.Cache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Do
 * @package com.eumji.ehcache.dao
 * @name UserRepository
 * @date 2017/3/30
 * @time 21:22
 */
@CacheConfig(cacheNames = "users")
public interface UserRepository extends CrudRepository<User, Integer> {

    @Cacheable(key = "#p0", condition = "#p0.length()<10")
    User findByUserName(String userName);
}
