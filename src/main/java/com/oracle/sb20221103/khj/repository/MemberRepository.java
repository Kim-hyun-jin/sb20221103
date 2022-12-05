package com.oracle.sb20221103.khj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oracle.sb20221103.domain.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

	@EntityGraph(attributePaths = "roleSet")
	@Query("select m from Member m where m.username = :username")
	Optional<Member> getWithRoles(String username);

}
