package com.sly.resumebp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sly.resumebp.model.Annex;

/**
 * 
 * @author sly
 * @time 2019年3月5日
 */
@Repository
public interface AnnexRepository extends JpaRepository<Annex, String> {

}
