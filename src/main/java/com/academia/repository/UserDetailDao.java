package com.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.entity.UserDetail;
@Repository
public interface UserDetailDao extends JpaRepository<UserDetail,Long>{

}
