package com.xiaohaoz.nbs.newstarblog.repository;

import com.xiaohaoz.nbs.newstarblog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Authority 仓库.
 *
 * @since 1.0.0 2017年3月2日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>
{
    Authority getById(Long id);
}
