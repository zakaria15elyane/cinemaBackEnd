package org.sid.cinema.dao;

import org.sid.cinema.entity.Categorie;
import org.sid.cinema.entity.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
@RepositoryRestResource
public interface ProjectionRepository extends JpaRepository<Projection, Long> {

}
