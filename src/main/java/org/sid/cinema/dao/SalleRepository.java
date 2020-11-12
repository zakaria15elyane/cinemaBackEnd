package org.sid.cinema.dao;

import org.sid.cinema.entity.Categorie;
import org.sid.cinema.entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
@RepositoryRestResource
public interface SalleRepository extends JpaRepository<Salle, Long> {

}
