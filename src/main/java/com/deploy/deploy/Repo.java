package com.deploy.deploy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Data, Integer> {
}
