package com.eumji.aspect.repository;

import com.eumji.aspect.vo.LogInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * eumji.eumji.aspect.repository.LogRepository.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 04
 * @day: 01
 * @time: 2017/4/1
 */
public interface LogRepository extends JpaRepository<LogInfo,Long> {
}
